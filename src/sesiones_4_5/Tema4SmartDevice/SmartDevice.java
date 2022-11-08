package sesiones_4_5.Tema4SmartDevice;

public class SmartDevice {
    // technical attributes
    private int id;
    double display;
    int battery;
    int ram;
    double memory;

    // surface attributes
    String model;
    String brand;
    String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SmartDevice() {

    }

    public SmartDevice(int id, double display, int battery, int ram, double memory) {
        this.id = id;
        this.display = display;
        this.battery = battery;
        this.ram = ram;
        this.memory = memory;
    }

    public SmartDevice(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public SmartDevice(int id, double display, int battery, int ram, double memory, String model, String brand, String color) {
        this.id = id;
        this.display = display;
        this.battery = battery;
        this.ram = ram;
        this.memory = memory;
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "id=" + id +
                ", display=" + display +
                ", battery=" + battery +
                ", ram=" + ram +
                ", memory=" + memory +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
