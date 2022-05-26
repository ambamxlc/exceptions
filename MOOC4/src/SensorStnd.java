public class SensorStnd implements Sensor {
 
    private int parameter;
 
    public SensorStnd(int p) {
        this.parameter = p;
    }
 
    @Override
    public boolean isOn() {
        return true;
    }
 
    @Override
    public void setOn() {
 
    }
 
    @Override
    public void setOff() {
 
    }
 
    @Override
    public int read() {
    return this.parameter;
    }
 
}