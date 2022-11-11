package sesiones_4_5.tema4;

public class Main {
    public static void main(String[] args) {
        SmartDevice phone = new SmartDevice(21, 7.7, 4000,6, 64.0,"note 7", "samsung","black");
        SmartDevice watch = new SmartWatch(22,1.1, 2000, 2, 32, "smartWatch 2", "apple", "gray", "read", true);
        SmartDevice iphone = new SmartPhone(99, 8.0, 5000, 8, 128, "iphone 17", "apple", "blue", 64, 1);

        String note7 = phone.toString();
        String smartWatch2 = watch.toString();
        String iphone17 = iphone.toString();

        System.out.println(note7);
        System.out.println(smartWatch2);
        System.out.println(iphone17);
    }
}
