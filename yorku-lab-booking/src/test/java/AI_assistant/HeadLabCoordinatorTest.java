package AI_assistant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.yorku.coordinator.HeadLabCoordinator;
import com.yorku.coordinator.LabManager;
import com.yorku.users.Guest;
import com.yorku.users.Student;
import com.yorku.users.User;
import com.yorku.users.UserRegistry;

class HeadLabCoordinatorTest {

    @BeforeEach
    void resetState() throws Exception {
        Field pendingApprovalsField = HeadLabCoordinator.class.getDeclaredField("pendingApprovals");
        pendingApprovalsField.setAccessible(true);
        pendingApprovalsField.set(HeadLabCoordinator.getInstance(), new ArrayList<User>());

        Field usersByEmailField = UserRegistry.class.getDeclaredField("usersByEmail");
        usersByEmailField.setAccessible(true);
        usersByEmailField.set(UserRegistry.getInstance(), new HashMap<String, User>());
    }

    @Test
    void getInstanceReturnsSingleton() {
        assertSame(HeadLabCoordinator.getInstance(), HeadLabCoordinator.getInstance());
    }

    @Test
    void generateLabManagerUsesEmailForIdentity() {
        LabManager manager = HeadLabCoordinator.getInstance()
            .generateLabManager("Alice", "alice@yorku.ca", "Password1!", "HC-1");

        assertEquals("alice@yorku.ca", manager.getEmail());
        assertEquals("alice@yorku.ca", manager.getName());
    }

    @Test
    void registerUniversityUserAddsPendingApproval() throws Exception {
        HeadLabCoordinator coordinator = HeadLabCoordinator.getInstance();
        User user = new Student("student@yorku.ca", "Password1!", "S1");

        assertTrue(coordinator.registerUser(user));
        assertEquals(User.Status.PENDING_APPROVAL, user.getStatus());
        assertTrue(coordinator.getPendingApprovals().contains(user));
    }

    @Test
    void registerGuestApprovesImmediately() throws Exception {
        HeadLabCoordinator coordinator = HeadLabCoordinator.getInstance();
        User user = new Guest("guest@yorku.ca", "Password1!", "G1");

        assertTrue(coordinator.registerUser(user));
        assertEquals(User.Status.APPROVED, user.getStatus());
        assertTrue(coordinator.getPendingApprovals().isEmpty());
    }

    @Test
    void approveAndRejectUpdateStatus() throws Exception {
        HeadLabCoordinator coordinator = HeadLabCoordinator.getInstance();
        User approved = new Student("approved@yorku.ca", "Password1!", "S2");
        coordinator.registerUser(approved);
        coordinator.approveUser(approved);
        assertEquals(User.Status.APPROVED, approved.getStatus());

        User rejected = new Student("rejected@yorku.ca", "Password1!", "S3");
        coordinator.registerUser(rejected);
        coordinator.rejectUser(rejected);
        assertEquals(User.Status.REJECTED, rejected.getStatus());
    }

    @Test
    void registerUserRejectsDuplicateWeakPasswordAndMissingId() throws Exception {
        HeadLabCoordinator coordinator = HeadLabCoordinator.getInstance();
        coordinator.registerUser(new Guest("dup@yorku.ca", "Password1!", "G2"));

        assertEquals(
            "Email already registered",
            assertThrows(
                Exception.class,
                () -> coordinator.registerUser(new Guest("dup@yorku.ca", "Password1!", "G3"))
            ).getMessage()
        );

        assertEquals(
            "Weak password. Must include uppercase, lowercase, number, symbol.",
            assertThrows(
                Exception.class,
                () -> coordinator.registerUser(new Guest("weak@yorku.ca", "weak", "G4"))
            ).getMessage()
        );

        assertEquals(
            "ID / Certification required",
            assertThrows(
                Exception.class,
                () -> coordinator.registerUser(new Guest("missing@yorku.ca", "Password1!", ""))
            ).getMessage()
        );
    }

    @Test
    void pendingApprovalsReturnedListIsDefensiveCopy() throws Exception {
        HeadLabCoordinator coordinator = HeadLabCoordinator.getInstance();
        coordinator.registerUser(new Student("copy@yorku.ca", "Password1!", "S4"));

        List<User> pending = coordinator.getPendingApprovals();
        pending.clear();

        assertEquals(1, coordinator.getPendingApprovals().size());
    }
}
