package hw2_3.task3;

import java.util.Objects;

public abstract class Animal {
    private final String name;
    private int age;


    private static final String DEFAULT = "Информация отсутствует";
    private static final int DEFAULT_AGE = 0;

    public Animal(String name, int age) {
        this.name = isValid(name) ? name : DEFAULT;
        setAge(age);
    }

    public Animal(String name) {
        this(name, DEFAULT_AGE);
    }

    public Animal() {
        this(DEFAULT);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age >= 0) ? age : DEFAULT_AGE;
    }


    public abstract void eat();

    public abstract void sleep();

    public abstract void go();

    @Override
    public String toString() {
        return "Животное - " + getName() + ", возраст - " + getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    protected static boolean isValid(String field) {
        return field != null && !field.isEmpty() && !field.isBlank();
    }
}
