package human_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.yorku.booking.BookingFacade;
import com.yorku.command.CancelCommand;
import com.yorku.command.ExtendCommand;
import com.yorku.command.ReserveCommand;
import com.yorku.equipment.Equipment;
import com.yorku.users.Faculty;
import com.yorku.users.Guest;
import com.yorku.users.Researcher;
import com.yorku.users.Student;
import com.yorku.users.User;

public class ExtendCommandTest {

    @Test
    void reserveThenExtendKeepsEquipmentUnavailable() {
        BookingFacade booking = new BookingFacade();
        User user = new Student("student1@yorku.ca", "pass", "S-21");
        Equipment equipment = new Equipment("EQ-501", "Microscope", "Lab A");

        new ReserveCommand(booking, user, equipment, 2).execute();
        new ExtendCommand(booking, user, equipment, 3).execute();

        assertTrue(!equipment.isAvailable());
    }

    @Test
    void extendWithoutReservationDoesNotChangeAvailability() {
        BookingFacade booking = new BookingFacade();
        User user = new Student("student2@yorku.ca", "pass", "S-22");
        Equipment equipment = new Equipment("EQ-502", "Oscilloscope", "Lab B");

        new ExtendCommand(booking, user, equipment, 2).execute();

        assertTrue(equipment.isAvailable());
    }

    @Test
    void reserveCancelThenExtendDoesNotReserveAgain() {
        BookingFacade booking = new BookingFacade();
        User user = new Student("student3@yorku.ca", "pass", "S-23");
        Equipment equipment = new Equipment("EQ-503", "Spectrometer", "Lab C");

        new ReserveCommand(booking, user, equipment, 2).execute();
        new CancelCommand(booking, user, equipment).execute();
        new ExtendCommand(booking, user, equipment, 1).execute();

        assertTrue(equipment.isAvailable());
    }

    @Test
    void reserveThenExtendByZeroHoursKeepsEquipmentUnavailable() {
        BookingFacade booking = new BookingFacade();
        User user = new Student("student4@yorku.ca", "pass", "S-24");
        Equipment equipment = new Equipment("EQ-504", "Laser Cutter", "Lab D");

        new ReserveCommand(booking, user, equipment, 2).execute();
        new ExtendCommand(booking, user, equipment, 0).execute();

        assertTrue(!equipment.isAvailable());
    }

    @Test
    void reserveThenExtendByNegativeHoursStillLeavesEquipmentUnavailable() {
        BookingFacade booking = new BookingFacade();
        User user = new Student("student5@yorku.ca", "pass", "S-25");
        Equipment equipment = new Equipment("EQ-505", "3D Printer", "Lab E");

        new ReserveCommand(booking, user, equipment, 2).execute();
        new ExtendCommand(booking, user, equipment, -1).execute();

        assertTrue(!equipment.isAvailable());
    }

    @Test
    void facultyCanReserveThenExtend() {
        BookingFacade booking = new BookingFacade();
        User user = new Faculty("faculty1@yorku.ca", "pass", "F-21");
        Equipment equipment = new Equipment("EQ-506", "Pipette Set", "Lab F");

        new ReserveCommand(booking, user, equipment, 1).execute();
        new ExtendCommand(booking, user, equipment, 2).execute();

        assertTrue(!equipment.isAvailable());
    }

    @Test
    void researcherCanReserveThenExtend() {
        BookingFacade booking = new BookingFacade();
        User user = new Researcher("researcher1@yorku.ca", "pass", "R-21");
        Equipment equipment = new Equipment("EQ-507", "Incubator", "Lab G");

        new ReserveCommand(booking, user, equipment, 3).execute();
        new ExtendCommand(booking, user, equipment, 1).execute();

        assertTrue(!equipment.isAvailable());
    }

    @Test
    void guestCanReserveThenExtend() {
        BookingFacade booking = new BookingFacade();
        User user = new Guest("guest1@email.com", "pass", "G-21");
        Equipment equipment = new Equipment("EQ-508", "Autoclave", "Lab H");

        new ReserveCommand(booking, user, equipment, 1).execute();
        new ExtendCommand(booking, user, equipment, 2).execute();

        assertTrue(!equipment.isAvailable());
    }

    @Test
    void differentUserCannotExtendAnotherUsersReservation() {
        BookingFacade booking = new BookingFacade();
        User firstUser = new Student("student6@yorku.ca", "pass", "S-26");
        User secondUser = new Student("student7@yorku.ca", "pass", "S-27");
        Equipment equipment = new Equipment("EQ-509", "Flow Cytometer", "Lab I");

        new ReserveCommand(booking, firstUser, equipment, 2).execute();
        new ExtendCommand(booking, secondUser, equipment, 1).execute();

        assertTrue(!equipment.isAvailable());
    }

    @Test
    void reserveTwiceThenExtendStillKeepsEquipmentUnavailable() {
        BookingFacade booking = new BookingFacade();
        User user = new Student("student8@yorku.ca", "pass", "S-28");
        Equipment equipment = new Equipment("EQ-510", "Voltage Meter", "Lab J");

        new ReserveCommand(booking, user, equipment, 2).execute();
        new ReserveCommand(booking, user, equipment, 2).execute();
        new ExtendCommand(booking, user, equipment, 2).execute();

        assertTrue(!equipment.isAvailable());
    }

    @Test
    void reserveThenCancelThenExtendLeavesEquipmentAvailable() {
        BookingFacade booking = new BookingFacade();
        User user = new Student("student9@yorku.ca", "pass", "S-29");
        Equipment equipment = new Equipment("EQ-511", "Signal Monitor", "Lab K");

        new ReserveCommand(booking, user, equipment, 2).execute();
        new CancelCommand(booking, user, equipment).execute();
        new ExtendCommand(booking, user, equipment, 4).execute();

        assertTrue(equipment.isAvailable());
    }
}
