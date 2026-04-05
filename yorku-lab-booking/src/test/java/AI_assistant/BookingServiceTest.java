package AI_assistant;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import com.yorku.booking.BookingService;

class BookingServiceTest {

    @Test
    void reserveDoesNotThrow() {
        assertDoesNotThrow(() -> new BookingService().reserve());
    }

    @Test
    void cancelDoesNotThrow() {
        assertDoesNotThrow(() -> new BookingService().cancel());
    }

    @Test
    void extendDoesNotThrow() {
        assertDoesNotThrow(() -> new BookingService().extend());
    }
}
