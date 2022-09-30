package hw2_3.transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private double velocity;
    private static final String DEFAULT = "default";
    private static final int DEFAULT_YEAR = 2000;
    private static final String DEFAULT_COUNTRY = "России";
    private static final String DEFAULT_COLOR = "белый";
    private static final double DEFAULT_VELOCITY = 0.0;

    public Transport(String brand, String model, int year, String country, String color, double velocity) {
        this.brand = isValid(brand) ? brand : DEFAULT;
        this.model = isValid(model) ? model : DEFAULT;
        this.year = year < 0 ? DEFAULT_YEAR : year;
        this.country = isValid(country) ? country : DEFAULT_COUNTRY;
        setColor(color);
        setVelocity(velocity);
    }

    public Transport(String brand, String model, int year, String country, double velocity) {
        this(brand, model, year, country, DEFAULT_COLOR, velocity);
    }

    public Transport(String brand, String model, int year, String country, String color) {
        this(brand, model, year, country, color, DEFAULT_VELOCITY);
    }
    public Transport(String brand, String model, int year, String country) {
        this(brand, model, year, country, DEFAULT_VELOCITY);
    }

    public Transport(String brand, String model, int year) {
        this(brand, model, year, DEFAULT_COUNTRY, DEFAULT_VELOCITY);
    }

    public Transport(String brand, String model) {
        this(brand, model, DEFAULT_YEAR);
    }

    public Transport(String brand) {
        this(brand, DEFAULT);
    }

    public Transport() {
        this(DEFAULT);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setColor(String color) {
        this.color = isValid(color) ? color : DEFAULT_COLOR;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity < 0 ? DEFAULT_VELOCITY : velocity;
    }

    protected static boolean isValid(String field) {
        return field != null && !field.isEmpty() && !field.isBlank();
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
