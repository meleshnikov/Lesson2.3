package hw2_3.tasks12;

import java.time.LocalDate;


public class Car extends Transport {

    private final String bodyType;
    private final int seatsCount;
    private double engineVolume;
    private String transmission;
    private String regNumber;
    private String tires;

    private static final double DEFAULT_ENGINE = 1.5;

    private static final String DEFAULT_TRANSMISSION = "механическая";
    private static final String DEFAULT_TIRES = "летняя";
    private static final String DEFAULT_BODY_TYPE = "седан";
    private static final int DEFAULT_SEATS_COUNT = 4;
    private static final String DEFAULT_NUMBER = "Х000Х000";
    private Key key;
    private Insurance insurance;

    private static final String CAR_INFO = "%s %s, %d год выпуска, сборка в %s, цвет кузова %s, объем двигателя - %s " +
            "литра, коробка передач - %s, тип кузова - %s, номер - %s, количество мест - %d, резина - %s, " +
            "%s доступ, %s запуск, номер страховки - %s, стоимость страховки %.1f руб, срок действия страховки %s";


    public Car(String brand,
               String model,
               int year,
               String country,
               String color,
               String bodyType,
               int seatsCount,
               Key key,
               Insurance insurance) {
        super(brand, model, year, country, color);
        this.bodyType = isValid(bodyType) ? bodyType : DEFAULT_BODY_TYPE;
        this.seatsCount = (seatsCount >= 2) && (seatsCount <= 7) ? seatsCount : DEFAULT_SEATS_COUNT;
        this.engineVolume = DEFAULT_ENGINE;
        this.transmission = DEFAULT_TRANSMISSION;
        this.regNumber = DEFAULT_NUMBER;
        this.tires = DEFAULT_TIRES;
        setKey(key);
        setInsurance(insurance);
    }


    @Override
    public String toString() {
        return String.format(CAR_INFO, getBrand(), getModel(), getYear(), getCountry(), getColor(), engineVolume,
                transmission, bodyType, regNumber.toUpperCase(), seatsCount, tires,
                (getKey().isKeyLessAccess() ? "бесключевой" : "ключевой"),
                (getKey().isRemoteEngineRun() ? "удаленный" : "обычный"),
                getInsurance().getNumber(), getInsurance().getCost(), getInsurance().getExpireDate());
    }

    @Override
    public void refill() {
        System.out.println("можно заправлять бензином");
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public String getTires() {
        return tires;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume >= 0 ? engineVolume : DEFAULT_ENGINE;
    }

    public void setTransmission(String transmission) {
        this.transmission = isValid(transmission) ? transmission : DEFAULT_TRANSMISSION;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = isValidRegNumber(regNumber) ? regNumber : DEFAULT_NUMBER;
    }

    public void setKey(Key key) {
        this.key = (key != null) ? key : new Key();
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = (insurance != null) ? insurance : new Insurance();
    }

    public void setTires(String tires) {
        this.tires = isValid(tires) ? tires : DEFAULT_TIRES;
    }

    private boolean isSummerSeason() {
        int m = LocalDate.now().getMonthValue();
        return (6 <= m) && (m <= 8);
    }

    public void setSeasonTires() {
        String tires = isSummerSeason() ? "летняя" : "зимняя";
        setTires(tires);
    }

    private boolean isValidRegNumber(String regNumber) {

        if (regNumber == null) {
            return false;
        }

        if ((regNumber.length() != 8) && (regNumber.length() != 9)) {
            return false;
        }

        for (int i = 0; i < regNumber.length(); i++) {
            if ((i == 0) || (i == 4) || (i == 5)) {
                if (!Character.isAlphabetic(regNumber.charAt(i))) {
                    return false;
                }
            } else if ((!Character.isDigit(regNumber.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidRegNumber() {
        return isValidRegNumber(this.regNumber);
    }

    public static class Key {
        private final boolean remoteEngineRun;
        private final boolean keyLessAccess;

        public Key(boolean remoteEngineRun, boolean keyLessAccess) {
            this.remoteEngineRun = remoteEngineRun;
            this.keyLessAccess = keyLessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineRun() {
            return remoteEngineRun;
        }

        public boolean isKeyLessAccess() {
            return keyLessAccess;
        }
    }

    public static class Insurance {

        private static final String DEFAULT_NUMBER = "123456789";
        private static final double DEFAULT_COST = 5_000;
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            this.expireDate = (expireDate != null) ? expireDate : LocalDate.now().plusDays(365);
            this.cost = (cost > 0) ? cost : DEFAULT_COST;
            this.number = (number != null) ? number : DEFAULT_NUMBER;
        }

        public Insurance() {
            this(null, DEFAULT_COST, DEFAULT_NUMBER);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

}

