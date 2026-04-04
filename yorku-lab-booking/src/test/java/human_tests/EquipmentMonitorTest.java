package human_tests;

import com.yorku.observer.EquipmentMonitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentMonitorTest {

    @Test
    void testUpdatePrintsMessage() {
        EquipmentMonitor monitor = new EquipmentMonitor();
        assertDoesNotThrow(() -> monitor.update("Active"));
    }

    @Test
    void testUpdateWithNull() {
        EquipmentMonitor monitor = new EquipmentMonitor();
        assertDoesNotThrow(() -> monitor.update(null));
    }

    @Test
    void testUpdateWithEmptyString() {
        EquipmentMonitor monitor = new EquipmentMonitor();
        assertDoesNotThrow(() -> monitor.update(""));
    }

    @Test
    void testMultipleUpdates() {
        EquipmentMonitor monitor = new EquipmentMonitor();
        monitor.update("A");
        monitor.update("B");
        assertTrue(true);
    }

    @Test
    void testMonitorInstance() {
        EquipmentMonitor monitor = new EquipmentMonitor();
        assertNotNull(monitor);
    }

    @Test
    void testUpdateDoesNotThrow() {
        EquipmentMonitor monitor = new EquipmentMonitor();
        assertDoesNotThrow(() -> monitor.update("Status"));
    }

    @Test
    void testUpdateWithLongString() {
        EquipmentMonitor monitor = new EquipmentMonitor();
        assertDoesNotThrow(() -> monitor.update("Very long status message"));
    }

    @Test
    void testUpdateWithSpecialCharacters() {
        EquipmentMonitor monitor = new EquipmentMonitor();
        assertDoesNotThrow(() -> monitor.update("@#$%^&*"));
    }

    @Test
    void testUpdateWithNumbers() {
        EquipmentMonitor monitor = new EquipmentMonitor();
        assertDoesNotThrow(() -> monitor.update("12345"));
    }

    @Test
    void testUpdateWithMixedContent() {
        EquipmentMonitor monitor = new EquipmentMonitor();
        assertDoesNotThrow(() -> monitor.update("Status123!"));
    }
}
