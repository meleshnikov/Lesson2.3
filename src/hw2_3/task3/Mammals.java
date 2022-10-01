package hw2_3.task3;

// млекопитающие

public abstract class Mammals extends Animal {

    private String environment;
    private double velocity;

    private static final String DEFAULT_ENVIRONMENT = "на суше";
    private static final double DEFAULT_VELOCITY = 0.0;

    public Mammals(String name, int age, String environment, double velocity) {
        super(name, age);
        setEnvironment(environment);
        setVelocity(velocity);
    }



    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = isValid(environment) ? environment : DEFAULT_ENVIRONMENT;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = (velocity > 0) ? velocity : DEFAULT_VELOCITY;
    }

    public abstract void walk();
}
