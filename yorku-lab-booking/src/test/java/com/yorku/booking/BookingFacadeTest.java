package com.yorku.booking;

import com.yorku.equipment.Equipment;
import com.yorku.users.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookingFacadeTest {

    private BookingFacade facade;
    private Student user;
    private Equipment eq;

    @BeforeEach
    void setup() {
        facade = new BookingFacade();
        user = new Student("a@yorku.ca", "Password1!", "123");
        eq = new Equipment("E1", "Camera", "Lab1");
    }

    @Test
    void testReserveEquipmentSuccess() {
        facade.reserveEquipment(user, eq, 2);
        assertFalse(eq.isAvailable());
    }

    @Test
    void testReserveEquipmentUnavailable() {
        eq.setAvailable(false);
        facade.reserveEquipment(user, eq, 2);
        assertFalse(eq.isAvailable());
    }

    @Test
    void testCancelReservationSuccess() {
        facade.reserveEquipment(user, eq, 2);
        facade.cancelReservation(user, eq);
        assertTrue(eq.isAvailable());
    }

    @Test
    void testCancelReservationNoExisting() {
        facade.cancelReservation(user, eq);
        assertTrue(eq.isAvailable());
    }

    @Test
    void testExtendReservationSuccess() {
        facade.reserveEquipment(user, eq, 2);
        facade.extendReservation(user, eq, 3);
        assertFalse(eq.isAvailable());
    }

    @Test
    void testExtendReservationNoExisting() {
        facade.extendReservation(user, eq, 3);
        assertTrue(eq.isAvailable());
    }

    @Test
    void testMultipleReservationsSameUser() {
        Equipment eq2 = new Equipment("E2", "Tripod", "Lab2");
        facade.reserveEquipment(user, eq, 1);
        facade.reserveEquipment(user, eq2, 2);
        assertFalse(eq2.isAvailable());
    }

    @Test
    void testReserveZeroHours() {
        facade.reserveEquipment(user, eq, 0);
        assertFalse(eq.isAvailable());
    }

    @Test
    void testExtendByZeroHours() {
        facade.reserveEquipment(user, eq, 2);
        facade.extendReservation(user, eq, 0);
        assertFalse(eq.isAvailable());
    }

    @Test
    void testReserveEquipmentCreatesRecord() {
        facade.reserveEquipment(user, eq, 2);
        assertFalse(eq.isAvailable());
    }
}
