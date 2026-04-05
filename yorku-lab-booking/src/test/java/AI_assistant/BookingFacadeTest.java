package AI_assistant;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.yorku.booking.BookingFacade;
import com.yorku.equipment.Equipment;
import com.yorku.users.Student;
import com.yorku.users.User;

class BookingFacadeTest {

    @Test
    void reserveEquipmentStoresReservationAndMarksEquipmentUnavailable() throws Exception {
        BookingFacade facade = new BookingFacade();
        User user = new Student("student@yorku.ca", "pass", "S1");
        Equipment equipment = new Equipment("EQ-1", "Microscope", "Lab A");

        facade.reserveEquipment(user, equipment, 2);

        assertFalse(equipment.isAvailable());
        assertTrue(getReservations(facade).containsKey(user));
        assertTrue(getReservations(facade).get(user).containsKey(equipment));
    }

    @Test
    void cancelReservationRemovesReservationAndRestoresAvailability() throws Exception {
        BookingFacade facade = new BookingFacade();
        User user = new Student("student2@yorku.ca", "pass", "S2");
        Equipment equipment = new Equipment("EQ-2", "Printer", "Lab B");
        facade.reserveEquipment(user, equipment, 3);

        facade.cancelReservation(user, equipment);

        assertTrue(equipment.isAvailable());
        assertFalse(getReservations(facade).containsKey(user));
    }

    @Test
    void extendReservationUpdatesReservedHours() throws Exception {
        BookingFacade facade = new BookingFacade();
        User user = new Student("student3@yorku.ca", "pass", "S3");
        Equipment equipment = new Equipment("EQ-3", "Scope", "Lab C");
        facade.reserveEquipment(user, equipment, 2);

        facade.extendReservation(user, equipment, 4);

        assertTrue(getReservations(facade).get(user).get(equipment) == 6);
    }

    @SuppressWarnings("unchecked")
    private Map<User, Map<Equipment, Integer>> getReservations(BookingFacade facade) throws Exception {
        Field field = BookingFacade.class.getDeclaredField("reservations");
        field.setAccessible(true);
        return (Map<User, Map<Equipment, Integer>>) field.get(facade);
    }
}
