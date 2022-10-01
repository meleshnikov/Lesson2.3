package hw2_3;

import hw2_3.task3.*;

public class AnimalsTest {
    public static void main(String[] args) {
        herbivoreTest();
        predatorTest();
        amphibianTest();
        birdTest();

    }

    private static void herbivoreTest() {
        System.out.println("Травоядные");

        Herbivore gazelle = new Herbivore("газель", 3, null, 6, null);
        Herbivore giraffe = new Herbivore("жираф", 8, "в саване", 5, "листья");
        Herbivore horse = new Herbivore("лошадь", -2, "в поле", 20, "сено");

        System.out.println(gazelle);

        gazelle.graze();
        gazelle.eat();
        gazelle.sleep();
        gazelle.go();

        System.out.println(giraffe);
        System.out.println(horse);

        System.out.println();
    }

    private static void predatorTest() {
        System.out.println("Хищники");

        Predator hyena = new Predator("гиена", 10, null, 6, null);
        Predator tiger = new Predator(null, 9, null, -5, "");
        Predator bear = new Predator("медведь", 25, "в лесу", 12, "мёд");

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        bear.hunter();
        bear.eat();
        bear.sleep();
        bear.go();

        System.out.println();
    }

    private static void amphibianTest() {
        System.out.println("Земноводные");

        Amphibian frog = new Amphibian("лягушка", 4, null);
        Amphibian snake = new Amphibian("уж пресноводный", 1, "в водоеме");

        System.out.println(frog);
        System.out.println(snake);

        snake.hunter();
        snake.eat();
        snake.go();

        System.out.println();
    }

    private static void birdTest() {
        System.out.println("Птицы");

        Flightless peacock = new Flightless("павлин", 13, null, null);
        Flightless penguin = new Flightless("пингвин", 3, "в море", "плавает");
        Flightless dodo = new Flightless("птица додо", 5, "в лесу", null);

        Flying gull = new Flying("чайка", 12, null, null);
        Flying albatross = new Flying("альбатрос", 2, "", "");
        Flying falcon = new Flying("сокол", 8, "в поле", null);

        System.out.println(peacock);

        peacock.walk();
        peacock.eat();
        peacock.go();
        peacock.sleep();

        System.out.println(penguin);
        System.out.println(dodo);

        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);

        falcon.fly();
        falcon.hunter();

        System.out.println();
    }
}
