package AI_assistant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.yorku.booking.BookingFacade;
import com.yorku.command.ReserveCommand;
import com.yorku.equipment.Equipment;
import com.yorku.users.Faculty;
import com.yorku.users.Guest;
import com.yorku.users.Researcher;
import com.yorku.users.Student;
import com.yorku.users.User;

class ReserveCommandTest {

    @Test
    void executeCallsReserveEquipmentOnBookingFacade() {
        User user = new Student("student@yorku.ca", "pass", "1001");
        Equipment equipment = new Equipment("EQ-100", "Microscope", "Lab A");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 3);

        assertRecordedValues(bookingFacade, user, equipment, 3);
    }

    @Test
    void executePassesFacultyUserToBookingFacade() {
        User user = new Faculty("faculty@yorku.ca", "pass", "2001");
        Equipment equipment = new Equipment("EQ-101", "Spectrometer", "Lab B");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 4);

        assertRecordedValues(bookingFacade, user, equipment, 4);
    }

    @Test
    void executePassesResearcherUserToBookingFacade() {
        User user = new Researcher("researcher@yorku.ca", "pass", "3001");
        Equipment equipment = new Equipment("EQ-102", "Laser Cutter", "Lab C");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 5);

        assertRecordedValues(bookingFacade, user, equipment, 5);
    }

    @Test
    void executePassesGuestUserToBookingFacade() {
        User user = new Guest("guest@yorku.ca", "pass", "4001");
        Equipment equipment = new Equipment("EQ-103", "3D Printer", "Lab D");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 1);

        assertRecordedValues(bookingFacade, user, equipment, 1);
    }

    @Test
    void executePassesZeroHoursToBookingFacade() {
        User user = new Student("student2@yorku.ca", "pass", "1002");
        Equipment equipment = new Equipment("EQ-104", "Oscilloscope", "Lab E");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 0);

        assertRecordedValues(bookingFacade, user, equipment, 0);
    }

    @Test
    void executePassesNegativeHoursToBookingFacade() {
        User user = new Student("student3@yorku.ca", "pass", "1003");
        Equipment equipment = new Equipment("EQ-105", "Microscope", "Lab F");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, -2);

        assertRecordedValues(bookingFacade, user, equipment, -2);
    }

    @Test
    void executePassesUnavailableEquipmentToBookingFacade() {
        User user = new Student("student4@yorku.ca", "pass", "1004");
        Equipment equipment = new Equipment("EQ-106", "Printer", "Lab G");
        equipment.setAvailable(false);
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 2);

        assertRecordedValues(bookingFacade, user, equipment, 2);
    }

    @Test
    void executePassesNullUserToBookingFacade() {
        Equipment equipment = new Equipment("EQ-107", "Pipette", "Lab H");
        RecordingBookingFacade bookingFacade = executeReserve(null, equipment, 3);

        assertTrue(bookingFacade.reserveCalled);
        assertNull(bookingFacade.recordedUser);
        assertSame(equipment, bookingFacade.recordedEquipment);
        assertEquals(3, bookingFacade.recordedHours);
    }

    @Test
    void executePassesNullEquipmentToBookingFacade() {
        User user = new Student("student5@yorku.ca", "pass", "1005");
        RecordingBookingFacade bookingFacade = executeReserve(user, null, 6);

        assertTrue(bookingFacade.reserveCalled);
        assertSame(user, bookingFacade.recordedUser);
        assertNull(bookingFacade.recordedEquipment);
        assertEquals(6, bookingFacade.recordedHours);
    }

    @Test
    void executeWithNullBookingFacadeThrowsNullPointerException() {
        User user = new Student("student6@yorku.ca", "pass", "1006");
        Equipment equipment = new Equipment("EQ-108", "Incubator", "Lab I");
        ReserveCommand command = new ReserveCommand(null, user, equipment, 2);

        assertThrows(NullPointerException.class, command::execute);
    }

    private RecordingBookingFacade executeReserve(User user, Equipment equipment, int hours) {
        RecordingBookingFacade bookingFacade = new RecordingBookingFacade();
        ReserveCommand command = new ReserveCommand(bookingFacade, user, equipment, hours);
        command.execute();
        return bookingFacade;
    }

    private void assertRecordedValues(
        RecordingBookingFacade bookingFacade,
        User user,
        Equipment equipment,
        int hours
    ) {
        assertTrue(bookingFacade.reserveCalled);
        assertSame(user, bookingFacade.recordedUser);
        assertSame(equipment, bookingFacade.recordedEquipment);
        assertEquals(hours, bookingFacade.recordedHours);
    }

    private static class RecordingBookingFacade extends BookingFacade {
        private boolean reserveCalled;
        private User recordedUser;
        private Equipment recordedEquipment;
        private int recordedHours;

        @Override
        public void reserveEquipment(User user, Equipment equipment, int hours) {
            reserveCalled = true;
            recordedUser = user;
            recordedEquipment = equipment;
            recordedHours = hours;
        }
    }
}
