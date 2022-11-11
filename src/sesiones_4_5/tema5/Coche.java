package sesiones_4_5.tema5;

public class Coche {
    String model;
    int year;
    String color;
    int id;
    int doors;
    int maxAcceleration;

    public Coche() {
    }

    public Coche(String model, int year, String color, int id, int doors, int maxAcceleration) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.id = id;
        this.doors = doors;
        this.maxAcceleration = maxAcceleration;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", id=" + id +
                ", doors=" + doors +
                ", maxAcceleration=" + maxAcceleration +
                '}';
    }
}
