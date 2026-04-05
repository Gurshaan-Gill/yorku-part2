package AI_assistant;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import com.yorku.observer.EquipmentMonitor;

class EquipmentMonitorTest {

    @Test
    void updateAcceptsStatusMessage() {
        EquipmentMonitor monitor = new EquipmentMonitor();

        assertDoesNotThrow(() -> monitor.update("In use"));
    }
}
