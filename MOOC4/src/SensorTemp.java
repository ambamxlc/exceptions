import java.util.Random;
 
public class SensorTemp implements Sensor {
 
    private boolean sensor;
 
    public SensorTemp() {
        this.sensor = false;
    }
 
    @Override
    public boolean isOn() {
        return this.sensor;
    }
 
    @Override
    public void setOn() {
        this.sensor = true;
    }
 
    @Override
    public void setOff() {
        this.sensor = false;
    }
 
    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException();
        }
        return new Random().nextInt(61) - 30;
    }
 
}