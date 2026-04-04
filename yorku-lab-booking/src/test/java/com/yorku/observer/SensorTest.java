package com.yorku.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SensorTest {

    @Test
    void testAttachObserver() {
        Sensor sensor = new Sensor();
        EquipmentMonitor monitor = new EquipmentMonitor();
        assertDoesNotThrow(() -> sensor.attach(monitor));
    }

    @Test
    void testNotifyObservers() {
        Sensor sensor = new Sensor();
        DummyObserver obs = new DummyObserver();
        sensor.attach(obs);
        sensor.notifyObservers("Active");
        assertEquals("Active", obs.lastStatus);
    }

    @Test
    void testDetectUsage() {
        Sensor sensor = new Sensor();
        DummyObserver obs = new DummyObserver();
        sensor.attach(obs);
        sensor.detectUsage("In Use");
        assertEquals("In Use", obs.lastStatus);
    }

    @Test
    void testMultipleObservers() {
        Sensor sensor = new Sensor();
        DummyObserver o1 = new DummyObserver();
        DummyObserver o2 = new DummyObserver();
        sensor.attach(o1);
        sensor.attach(o2);
        sensor.notifyObservers("X");
        assertEquals("X", o1.lastStatus);
        assertEquals("X", o2.lastStatus);
    }

    @Test
    void testNotifyWithNull() {
        Sensor sensor = new Sensor();
        DummyObserver obs = new DummyObserver();
        sensor.attach(obs);
        sensor.notifyObservers(null);
        assertNull(obs.lastStatus);
    }

    @Test
    void testNotifyWithEmptyString() {
        Sensor sensor = new Sensor();
        DummyObserver obs = new DummyObserver();
        sensor.attach(obs);
        sensor.notifyObservers("");
        assertEquals("", obs.lastStatus);
    }

    @Test
    void testAttachMultipleTimes() {
        Sensor sensor = new Sensor();
        DummyObserver obs = new DummyObserver();
        sensor.attach(obs);
        sensor.attach(obs);
        sensor.notifyObservers("Test");
        assertEquals("Test", obs.lastStatus);
    }

    @Test
    void testDetectUsageDoesNotThrow() {
        Sensor sensor = new Sensor();
        assertDoesNotThrow(() -> sensor.detectUsage("OK"));
    }

    @Test
    void testNotifyObserversDoesNotThrow() {
        Sensor sensor = new Sensor();
        assertDoesNotThrow(() -> sensor.notifyObservers("OK"));
    }

    @Test
    void testSensorInstance() {
        Sensor sensor = new Sensor();
        assertNotNull(sensor);
    }

    static class DummyObserver implements Observer {
        String lastStatus;
        @Override
        public void update(String status) {
            lastStatus = status;
        }
    }
}
