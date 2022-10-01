package hw2_3.task3;

// земноводные

public final class Amphibian extends Animal {

    private String environment;
    private final static String DEFAULT_ENVIRONMENT = "в болоте";

    public Amphibian(String name, int age, String environment) {
        super(name, age);
        setEnvironment(environment);
    }


    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = isValid(environment) ? environment : DEFAULT_ENVIRONMENT;
    }

    public void hunter() {
        System.out.println(getName() + " ловит насекомых");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест насекомых");
    }

    @Override
    public void sleep() {
        System.out.println("спит " + environment);
    }

    @Override
    public void go() {
        System.out.println("ходит");
    }

    @Override
    public String toString() {
        return super.toString() + ", проживает " + getEnvironment();
    }


}
