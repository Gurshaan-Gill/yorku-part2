package AI_assistant;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.yorku.observer.Observer;
import com.yorku.observer.Sensor;

class SensorTest {

    @Test
    void notifyObserversSendsStatusToAttachedObservers() {
        Sensor sensor = new Sensor();
        RecordingObserver first = new RecordingObserver();
        RecordingObserver second = new RecordingObserver();
        sensor.attach(first);
        sensor.attach(second);

        sensor.notifyObservers("Occupied");

        assertEquals("Occupied", first.lastStatus);
        assertEquals("Occupied", second.lastStatus);
    }

    @Test
    void detectUsageDelegatesToNotifyObservers() {
        Sensor sensor = new Sensor();
        RecordingObserver observer = new RecordingObserver();
        sensor.attach(observer);

        sensor.detectUsage("In maintenance");

        assertEquals("In maintenance", observer.lastStatus);
    }

    private static class RecordingObserver implements Observer {
        private String lastStatus;

        @Override
        public void update(String status) {
            lastStatus = status;
        }
    }
}
