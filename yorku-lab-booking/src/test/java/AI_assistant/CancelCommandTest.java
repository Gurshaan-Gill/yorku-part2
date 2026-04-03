package AI_assistant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.yorku.booking.BookingFacade;
import com.yorku.command.CancelCommand;
import com.yorku.equipment.Equipment;
import com.yorku.users.Faculty;
import com.yorku.users.Guest;
import com.yorku.users.Researcher;
import com.yorku.users.Student;
import com.yorku.users.User;

class CancelCommandTest {

    @Test
    void executeCallsCancelReservationOnBookingFacade() {
        User user = new Student("student@yorku.ca", "pass", "1003");
        Equipment equipment = new Equipment("EQ-102", "3D Printer", "Lab C");
        RecordingBookingFacade bookingFacade = executeCancel(user, equipment);

        assertRecordedValues(bookingFacade, user, equipment);
    }

    @Test
    void executePassesFacultyUserToBookingFacade() {
        User user = new Faculty("faculty@yorku.ca", "pass", "2003");
        Equipment equipment = new Equipment("EQ-120", "Microscope", "Lab A");
        RecordingBookingFacade bookingFacade = executeCancel(user, equipment);

        assertRecordedValues(bookingFacade, user, equipment);
    }

    @Test
    void executePassesResearcherUserToBookingFacade() {
        User user = new Researcher("researcher@yorku.ca", "pass", "3003");
        Equipment equipment = new Equipment("EQ-121", "Spectrometer", "Lab B");
        RecordingBookingFacade bookingFacade = executeCancel(user, equipment);

        assertRecordedValues(bookingFacade, user, equipment);
    }

    @Test
    void executePassesGuestUserToBookingFacade() {
        User user = new Guest("guest@yorku.ca", "pass", "4003");
        Equipment equipment = new Equipment("EQ-122", "Laser Cutter", "Lab C");
        RecordingBookingFacade bookingFacade = executeCancel(user, equipment);

        assertRecordedValues(bookingFacade, user, equipment);
    }

    @Test
    void executePassesUnavailableEquipmentToBookingFacade() {
        User user = new Student("student2@yorku.ca", "pass", "1012");
        Equipment equipment = new Equipment("EQ-123", "Oscilloscope", "Lab D");
        equipment.setAvailable(false);
        RecordingBookingFacade bookingFacade = executeCancel(user, equipment);

        assertRecordedValues(bookingFacade, user, equipment);
    }

    @Test
    void executePassesAvailableEquipmentToBookingFacade() {
        User user = new Student("student3@yorku.ca", "pass", "1013");
        Equipment equipment = new Equipment("EQ-124", "Pipette", "Lab E");
        RecordingBookingFacade bookingFacade = executeCancel(user, equipment);

        assertRecordedValues(bookingFacade, user, equipment);
    }

    @Test
    void executePassesNullUserToBookingFacade() {
        Equipment equipment = new Equipment("EQ-125", "Incubator", "Lab F");
        RecordingBookingFacade bookingFacade = executeCancel(null, equipment);

        assertTrue(bookingFacade.cancelCalled);
        assertNull(bookingFacade.recordedUser);
        assertSame(equipment, bookingFacade.recordedEquipment);
    }

    @Test
    void executePassesNullEquipmentToBookingFacade() {
        User user = new Student("student4@yorku.ca", "pass", "1014");
        RecordingBookingFacade bookingFacade = executeCancel(user, null);

        assertTrue(bookingFacade.cancelCalled);
        assertSame(user, bookingFacade.recordedUser);
        assertNull(bookingFacade.recordedEquipment);
    }

    @Test
    void executeCanBeCalledTwice() {
        RecordingBookingFacade bookingFacade = new RecordingBookingFacade();
        User user = new Student("student5@yorku.ca", "pass", "1015");
        Equipment equipment = new Equipment("EQ-126", "Autoclave", "Lab G");
        CancelCommand command = new CancelCommand(bookingFacade, user, equipment);

        command.execute();
        command.execute();

        assertEquals(2, bookingFacade.cancelCallCount);
        assertSame(user, bookingFacade.recordedUser);
        assertSame(equipment, bookingFacade.recordedEquipment);
    }

    @Test
    void executeWithNullBookingFacadeThrowsNullPointerException() {
        User user = new Student("student6@yorku.ca", "pass", "1016");
        Equipment equipment = new Equipment("EQ-127", "Centrifuge", "Lab H");
        CancelCommand command = new CancelCommand(null, user, equipment);

        assertThrows(NullPointerException.class, command::execute);
    }

    private RecordingBookingFacade executeCancel(User user, Equipment equipment) {
        RecordingBookingFacade bookingFacade = new RecordingBookingFacade();
        CancelCommand command = new CancelCommand(bookingFacade, user, equipment);
        command.execute();
        return bookingFacade;
    }

    private void assertRecordedValues(
        RecordingBookingFacade bookingFacade,
        User user,
        Equipment equipment
    ) {
        assertTrue(bookingFacade.cancelCalled);
        assertSame(user, bookingFacade.recordedUser);
        assertSame(equipment, bookingFacade.recordedEquipment);
    }

    private static class RecordingBookingFacade extends BookingFacade {
        private boolean cancelCalled;
        private int cancelCallCount;
        private User recordedUser;
        private Equipment recordedEquipment;

        @Override
        public void cancelReservation(User user, Equipment equipment) {
            cancelCalled = true;
            cancelCallCount++;
            recordedUser = user;
            recordedEquipment = equipment;
        }
    }
}
