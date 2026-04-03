package human_tests;

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


public class ReserveCommandTest {
    @Test
    void executeCallsReserveEquipment() {
        User user = new Student("student@yorku.ca", "pass", "1001");
        Equipment equipment = new Equipment("EQ-201", "Microscope", "Lab A");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 3);

        assertRecordedValues(bookingFacade, user, equipment, 3);
    }

    @Test
    void executeWithStudentUser() {
        User user = new Student("student2@yorku.ca", "pass", "1002");
        Equipment equipment = new Equipment("EQ-202", "Oscilloscope", "Lab B");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 2);

        assertRecordedValues(bookingFacade, user, equipment, 2);
    }

    @Test
    void executeWithFacultyUser() {
        User user = new Faculty("faculty@yorku.ca", "pass", "2001");
        Equipment equipment = new Equipment("EQ-203", "Laser Cutter", "Lab C");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 4);

        assertRecordedValues(bookingFacade, user, equipment, 4);
    }

    @Test
    void executeWithResearcherUser() {
        User user = new Researcher("researcher@yorku.ca", "pass", "3001");
        Equipment equipment = new Equipment("EQ-204", "3D Printer", "Lab D");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 5);

        assertRecordedValues(bookingFacade, user, equipment, 5);
    }

    @Test
    void executeWithGuestUser() {
        User user = new Guest("guest@yorku.ca", "pass", "4001");
        Equipment equipment = new Equipment("EQ-205", "Pipette Set", "Lab E");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 1);

        assertRecordedValues(bookingFacade, user, equipment, 1);
    }

    @Test
    void executeWithZeroHours() {
        User user = new Student("student3@yorku.ca", "pass", "1003");
        Equipment equipment = new Equipment("EQ-206", "Incubator", "Lab F");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 0);

        assertRecordedValues(bookingFacade, user, equipment, 0);
    }

    @Test
    void executeWithNegativeHours() {
        User user = new Student("student4@yorku.ca", "pass", "1004");
        Equipment equipment = new Equipment("EQ-207", "Autoclave", "Lab G");
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, -1);

        assertRecordedValues(bookingFacade, user, equipment, -1);
    }

    @Test
    void executeWithUnavailableEquipment() {
        User user = new Student("student5@yorku.ca", "pass", "1005");
        Equipment equipment = new Equipment("EQ-208", "Centrifuge", "Lab H");
        equipment.setAvailable(false);
        RecordingBookingFacade bookingFacade = executeReserve(user, equipment, 2);

        assertRecordedValues(bookingFacade, user, equipment, 2);
    }

    @Test
    void executeWithNullUser() {
        Equipment equipment = new Equipment("EQ-209", "Flow Cytometer", "Lab I");
        RecordingBookingFacade bookingFacade = executeReserve(null, equipment, 3);

        assertTrue(bookingFacade.reserveCalled);
        assertNull(bookingFacade.recordedUser);
        assertSame(equipment, bookingFacade.recordedEquipment);
        assertEquals(3, bookingFacade.recordedHours);
    }

    @Test
    void executeWithNullBookingFacadeThrowsException() {
        User user = new Student("student6@yorku.ca", "pass", "1006");
        Equipment equipment = new Equipment("EQ-210", "Spectrometer", "Lab J");
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
