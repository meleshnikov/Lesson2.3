package hw2_3;

import hw2_3.tasks12.Bus;
import hw2_3.tasks12.Car;
import hw2_3.tasks12.Train;


public class Main {
    public static void main(String[] args) {
        testCar();
        System.out.println();
        testTrain();
        System.out.println();
        testBus();
    }

    private static void testCar() {
        var lada = new Car("Lada", "Grande", 2015, "России",
                "", null, 4, null, null);
        var audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии",
                "черный", "", 5, null, null);
        var bmw = new Car("BMW", "Z8", 2021, "Германии",
                "черный", "", 4, null, null);
        var kia = new Car("Kia", "Sportage 4 поколение", 2018, "Южной Корее",
                "красный", "хетчбэк", 5, null, null);
        var hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее",
                "оранжевый", null, 4, null, null);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }

    private static void testTrain() {
        Train lastochka = new Train("Ласточка", "B-901", 2011, "России", 301,
                3500, "Белорусского", "Минск", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "России", 270,
                1700, "Ленинградского", "Ленинград", 8);
        System.out.println(lastochka);
        System.out.println(leningrad);
    }

    private static void testBus() {
        Bus bus1 = new Bus();
        Bus paz = new Bus("ПАЗ", "3206", 1995, null, "синий", 80);
        Bus volvo = new Bus("Volvo", "9500", 2010, "Швеции", 180);
        System.out.println(bus1);
        System.out.println(paz);
        System.out.println(volvo);
    }
}