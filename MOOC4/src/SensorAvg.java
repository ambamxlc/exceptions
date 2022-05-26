import java.util.ArrayList;
import java.util.List;
 
public class SensorAvg implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> reading;
    
    public SensorAvg() {
        this.sensors = new ArrayList<>();
        this.reading = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        for (Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void setOn() {
        for (Sensor s : sensors) {
            s.setOn();
        }
    }
    
    @Override
    public void setOff() {
        for (Sensor s : sensors) {
            s.setOff();
        }
    }
    
    @Override
    public int read() {
        if (this.sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException();
        }
        int avg = 0;
        for (Sensor s : this.sensors) {
            avg += s.read();
        }
        this.reading.add(avg / this.sensors.size());
        return avg / this.sensors.size();
    }
    
    public List<Integer> readings() {
        return reading;
    }
}