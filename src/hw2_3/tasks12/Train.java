package hw2_3.tasks12;

public class Train extends Transport {
    private double price;
    private double time;
    private String initStation;
    private String finishStation;
    private int wagonsCount;

    private static final double DEFAULT_PRICE = 100.0;
    private static final double DEFAULT_TIME = 1.0;
    private static final String DEFAULT_STATION = "Информация отсутствует";
    private static final int DEFAULT_WAGONS_COUNT = 3;
    private static final String TRAIN_INFO = "Поезд %s, модель %s, %d год выпуска в %s, " +
            "скорость передвижения – %.1f км/ч, отходит от %s вокзала и следует до станции %s-Пассажирский. " +
            "Цена поездки - %.1f рублей, в поезде %d вагонов";

    public Train(String brand,
                 String model,
                 int year,
                 String country,
                 double velocity,
                 double price,
                 String initStation,
                 String finishStation,
                 int wagonsCount) {
        super(brand, model, year, country, velocity);
        setPrice(price);
        setInitStation(initStation);
        setFinishStation(finishStation);
        setWagonsCount(wagonsCount);
    }

    public double getPrice() {
        return price;
    }

    public double getTime() {
        return time;
    }

    public String getInitStation() {
        return initStation;
    }

    public String getFinishStation() {
        return finishStation;
    }

    public int getWagonsCount() {
        return wagonsCount;
    }

    public void setPrice(double price) {
        this.price = price > 0 ? price : DEFAULT_PRICE;
    }

    public void setTime(double time) {
        this.time = time > 0 ? time : DEFAULT_TIME;
    }

    public void setInitStation(String initStation) {
        this.initStation = isValid(initStation) ? initStation : DEFAULT_STATION;
    }

    public void setFinishStation(String finishStation) {
        this.finishStation = isValid(finishStation) ? finishStation : DEFAULT_STATION;
    }

    public void setWagonsCount(int wagonsCount) {
        this.wagonsCount = wagonsCount >= 0 ? wagonsCount : DEFAULT_WAGONS_COUNT;
    }

    @Override
    public String toString() {
        return String.format(TRAIN_INFO, getBrand(), getModel(), getYear(),
                getCountry(), getVelocity(), initStation, finishStation, price, wagonsCount);
    }

    @Override
    public void refill() {
        System.out.println("можно заправлять дизелем");
    }
}
