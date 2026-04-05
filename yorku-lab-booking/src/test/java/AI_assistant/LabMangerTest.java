package AI_assistant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.yorku.coordinator.LabManager;
import com.yorku.equipment.Equipment;

class LabMangerTest {

    private LabManager labManager;

    @BeforeEach
    void setUp() {
        labManager = new LabManager("manager@yorku.ca");
    }

    @Test
    void constructorLoadsEquipmentInventory() {
        assertEquals(10, labManager.getAllEquipment().size());
        assertNotNull(labManager.getEquipment("EQ-001"));
    }

    @Test
    void availabilityOperationsUpdateEquipmentState() {
        labManager.disableEquipment("EQ-001");
        assertFalse(labManager.getEquipment("EQ-001").isAvailable());

        labManager.enableEquipment("EQ-001");
        assertTrue(labManager.getEquipment("EQ-001").isAvailable());

        labManager.markForMaintenance("EQ-001");
        assertFalse(labManager.getEquipment("EQ-001").isAvailable());
    }

    @Test
    void getAvailableEquipmentReturnsOnlyAvailableItems() {
        List<Equipment> availableEquipment = labManager.getAvailableEquipment();

        assertTrue(availableEquipment.stream().allMatch(Equipment::isAvailable));
    }
}
