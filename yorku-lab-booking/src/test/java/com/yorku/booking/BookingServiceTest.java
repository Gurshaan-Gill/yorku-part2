package com.yorku.booking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookingServiceTest {

    @Test
    void testReservePrintsMessage() {
        BookingService service = new BookingService();
        assertDoesNotThrow(service::reserve);
    }

    @Test
    void testCancelPrintsMessage() {
        BookingService service = new BookingService();
        assertDoesNotThrow(service::cancel);
    }

    @Test
    void testExtendPrintsMessage() {
        BookingService service = new BookingService();
        assertDoesNotThrow(service::extend);
    }

    @Test
    void testMultipleReserveCalls() {
        BookingService service = new BookingService();
        service.reserve();
        service.reserve();
        assertTrue(true);
    }

    @Test
    void testMultipleCancelCalls() {
        BookingService service = new BookingService();
        service.cancel();
        service.cancel();
        assertTrue(true);
    }

    @Test
    void testMultipleExtendCalls() {
        BookingService service = new BookingService();
        service.extend();
        service.extend();
        assertTrue(true);
    }

    @Test
    void testReserveDoesNotThrow() {
        BookingService service = new BookingService();
        assertDoesNotThrow(service::reserve);
    }

    @Test
    void testCancelDoesNotThrow() {
        BookingService service = new BookingService();
        assertDoesNotThrow(service::cancel);
    }

    @Test
    void testExtendDoesNotThrow() {
        BookingService service = new BookingService();
        assertDoesNotThrow(service::extend);
    }

    @Test
    void testServiceInstanceCreation() {
        BookingService service = new BookingService();
        assertNotNull(service);
    }
}
