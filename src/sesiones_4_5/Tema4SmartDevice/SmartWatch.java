package sesiones_4_5.Tema4SmartDevice;

public class SmartWatch extends SmartDevice{

    String watchbandColor;
    boolean sensor;

    public SmartWatch() {
    }

    public SmartWatch(int id, double display, int battery, int ram, double memory, String model, String brand, String color, String watchbandColor, boolean sensor) {
        super(id, display, battery, ram, memory, model, brand, color);
        this.watchbandColor = watchbandColor;
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
