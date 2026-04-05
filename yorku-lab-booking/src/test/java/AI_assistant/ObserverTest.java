package AI_assistant;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import com.yorku.observer.Observer;

class ObserverTest {

    @Test
    void observerImplementationReceivesStatusUpdate() {
        Observer observer = status -> {
            if (status == null) {
                throw new IllegalArgumentException("status");
            }
        };

        assertDoesNotThrow(() -> observer.update("Available"));
    }
}
