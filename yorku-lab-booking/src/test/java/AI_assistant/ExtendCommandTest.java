package AI_assistant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.yorku.booking.BookingFacade;
import com.yorku.command.ExtendCommand;
import com.yorku.equipment.Equipment;
import com.yorku.users.Faculty;
import com.yorku.users.Guest;
import com.yorku.users.Researcher;
import com.yorku.users.Student;
import com.yorku.users.User;

class ExtendCommandTest {

    @Test
    void executeCallsExtendReservationOnBookingFacade() {
        User user = new Student("student@yorku.ca", "pass", "1002");
        Equipment equipment = new Equipment("EQ-101", "Oscilloscope", "Lab B");
        RecordingBookingFacade bookingFacade = executeExtend(user, equipment, 2);

        assertRecordedValues(bookingFacade, user, equipment, 2);
    }

    @Test
    void executePassesFacultyUserToBookingFacade() {
        User user = new Faculty("faculty@yorku.ca", "pass", "2002");
        Equipment equipment = new Equipment("EQ-110", "Microscope", "Lab A");
        RecordingBookingFacade bookingFacade = executeExtend(user, equipment, 1);

        assertRecordedValues(bookingFacade, user, equipment, 1);
    }

    @Test
    void executePassesResearcherUserToBookingFacade() {
        User user = new Researcher("researcher@yorku.ca", "pass", "3002");
        Equipment equipment = new Equipment("EQ-111", "Spectrometer", "Lab B");
        RecordingBookingFacade bookingFacade = executeExtend(user, equipment, 4);

        assertRecordedValues(bookingFacade, user, equipment, 4);
    }

    @Test
    void executePassesGuestUserToBookingFacade() {
        User user = new Guest("guest@yorku.ca", "pass", "4002");
        Equipment equipment = new Equipment("EQ-112", "Printer", "Lab C");
        RecordingBookingFacade bookingFacade = executeExtend(user, equipment, 3);

        assertRecordedValues(bookingFacade, user, equipment, 3);
    }

    @Test
    void executePassesZeroAdditionalHoursToBookingFacade() {
        User user = new Student("student2@yorku.ca", "pass", "1007");
        Equipment equipment = new Equipment("EQ-113", "Pipette", "Lab D");
        RecordingBookingFacade bookingFacade = executeExtend(user, equipment, 0);

        assertRecordedValues(bookingFacade, user, equipment, 0);
    }

    @Test
    void executePassesNegativeAdditionalHoursToBookingFacade() {
        User user = new Student("student3@yorku.ca", "pass", "1008");
        Equipment equipment = new Equipment("EQ-114", "Incubator", "Lab E");
        RecordingBookingFacade bookingFacade = executeExtend(user, equipment, -1);

        assertRecordedValues(bookingFacade, user, equipment, -1);
    }

    @Test
    void executePassesUnavailableEquipmentToBookingFacade() {
        User user = new Student("student4@yorku.ca", "pass", "1009");
        Equipment equipment = new Equipment("EQ-115", "Laser Cutter", "Lab F");
        equipment.setAvailable(false);
        RecordingBookingFacade bookingFacade = executeExtend(user, equipment, 6);

        assertRecordedValues(bookingFacade, user, equipment, 6);
    }

    @Test
    void executePassesNullUserToBookingFacade() {
        Equipment equipment = new Equipment("EQ-116", "Centrifuge", "Lab G");
        RecordingBookingFacade bookingFacade = executeExtend(null, equipment, 2);

        assertTrue(bookingFacade.extendCalled);
        assertNull(bookingFacade.recordedUser);
        assertSame(equipment, bookingFacade.recordedEquipment);
        assertEquals(2, bookingFacade.recordedAdditionalHours);
    }

    @Test
    void executePassesNullEquipmentToBookingFacade() {
        User user = new Student("student5@yorku.ca", "pass", "1010");
        RecordingBookingFacade bookingFacade = executeExtend(user, null, 7);

        assertTrue(bookingFacade.extendCalled);
        assertSame(user, bookingFacade.recordedUser);
        assertNull(bookingFacade.recordedEquipment);
        assertEquals(7, bookingFacade.recordedAdditionalHours);
    }

    @Test
    void executeWithNullBookingFacadeThrowsNullPointerException() {
        User user = new Student("student6@yorku.ca", "pass", "1011");
        Equipment equipment = new Equipment("EQ-117", "Autoclave", "Lab H");
        ExtendCommand command = new ExtendCommand(null, user, equipment, 2);

        assertThrows(NullPointerException.class, command::execute);
    }

    private RecordingBookingFacade executeExtend(User user, Equipment equipment, int additionalHours) {
        RecordingBookingFacade bookingFacade = new RecordingBookingFacade();
        ExtendCommand command = new ExtendCommand(bookingFacade, user, equipment, additionalHours);
        command.execute();
        return bookingFacade;
    }

    private void assertRecordedValues(
        RecordingBookingFacade bookingFacade,
        User user,
        Equipment equipment,
        int additionalHours
    ) {
        assertTrue(bookingFacade.extendCalled);
        assertSame(user, bookingFacade.recordedUser);
        assertSame(equipment, bookingFacade.recordedEquipment);
        assertEquals(additionalHours, bookingFacade.recordedAdditionalHours);
    }

    private static class RecordingBookingFacade extends BookingFacade {
        private boolean extendCalled;
        private User recordedUser;
        private Equipment recordedEquipment;
        private int recordedAdditionalHours;

        @Override
        public void extendReservation(User user, Equipment equipment, int additionalHours) {
            extendCalled = true;
            recordedUser = user;
            recordedEquipment = equipment;
            recordedAdditionalHours = additionalHours;
        }
    }
}
