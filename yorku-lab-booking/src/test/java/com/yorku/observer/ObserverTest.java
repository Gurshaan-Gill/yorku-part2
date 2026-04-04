package com.yorku.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest {

    static class DummyObserver implements Observer {
        String lastStatus;
        @Override
        public void update(String status) {
            lastStatus = status;
        }
    }

    @Test
    void testObserverReceivesUpdate() {
        DummyObserver obs = new DummyObserver();
        obs.update("Active");
        assertEquals("Active", obs.lastStatus);
    }

    @Test
    void testObserverReceivesNull() {
        DummyObserver obs = new DummyObserver();
        obs.update(null);
        assertNull(obs.lastStatus);
    }

    @Test
    void testObserverReceivesEmptyString() {
        DummyObserver obs = new DummyObserver();
        obs.update("");
        assertEquals("", obs.lastStatus);
    }

    @Test
    void testMultipleUpdates() {
        DummyObserver obs = new DummyObserver();
        obs.update("A");
        obs.update("B");
        assertEquals("B", obs.lastStatus);
    }

    @Test
    void testObserverInstance() {
        DummyObserver obs = new DummyObserver();
        assertNotNull(obs);
    }

    @Test
    void testUpdateWithNumbers() {
        DummyObserver obs = new DummyObserver();
        obs.update("123");
        assertEquals("123", obs.lastStatus);
    }

    @Test
    void testUpdateWithSymbols() {
        DummyObserver obs = new DummyObserver();
        obs.update("@@@");
        assertEquals("@@@", obs.lastStatus);
    }

    @Test
    void testUpdateWithLongString() {
        DummyObserver obs = new DummyObserver();
        obs.update("Long status message");
        assertEquals("Long status message", obs.lastStatus);
    }

    @Test
    void testUpdateWithMixedContent() {
        DummyObserver obs = new DummyObserver();
        obs.update("Mix123!");
        assertEquals("Mix123!", obs.lastStatus);
    }

    @Test
    void testUpdateDoesNotThrow() {
        DummyObserver obs = new DummyObserver();
        assertDoesNotThrow(() -> obs.update("OK"));
    }
}
