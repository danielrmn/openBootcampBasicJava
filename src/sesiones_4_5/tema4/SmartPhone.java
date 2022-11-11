package sesiones_4_5.tema4;

import sesiones_4_5.tema4.SmartDevice;

public class SmartPhone extends SmartDevice {

    int megaPixeles;
    int sms;

    public SmartPhone() {
    }

    public SmartPhone(int id, double display, int battery, int ram, double memory, String model, String brand, String color, int megaPixeles, int sms) {
        super(id, display, battery, ram, memory, model, brand, color);
        this.megaPixeles = megaPixeles;
        this.sms = sms;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
