package hw2_3.tasks12;

public class Bus extends Transport {

    private static final String BUS_INFO = "Автобус %s %s, сделан в %s, в %d году, цвет - %s, " +
            "максимальная скорость - %.1f км/ч";

    public Bus(String brand, String model, int year, String country, String color, double velocity) {
        super(brand, model, year, country, color, velocity);
    }

    public Bus(String brand, String model, int year, String country, double velocity) {
        super(brand, model, year, country, velocity);
    }

    public Bus(String brand, String model, int year, String country) {
        super(brand, model, year, country);
    }

    public Bus(String brand, String model, int year) {
        super(brand, model, year);
    }

    public Bus(String brand, String model) {
        super(brand, model);
    }

    public Bus(String brand) {
        super(brand);
    }

    public Bus() {
        super();
    }

    @Override
    public String toString() {
        return String.format(BUS_INFO, getBrand(), getModel(), getCountry(), getYear(), getColor(), getVelocity());
    }

    @Override
    public void refill() {
        System.out.println("можно заправлять дизелем");
    }
}
