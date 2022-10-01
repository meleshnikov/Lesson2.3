package hw2_3.task3;

// летающие

public class Flying extends Bird {

    private String movementType;
    private static final String DEFAULT_MOVEMENT = "летает";

    public Flying(String name, int age, String environment, String movementType) {
        super(name, age, environment);
        setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public final void setMovementType(String movementType) {
        this.movementType = isValid(movementType) ? movementType : DEFAULT_MOVEMENT;
    }

    public void fly() {
        System.out.println(getName() + " летит");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " клюёт насекомых");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит " + getEnvironment());
    }

    @Override
    public void go() {
        System.out.println(getName() + " идет");
    }

    @Override
    public String toString() {
        return super.toString()
                + ", живет, " + getEnvironment()
                + ", " + getMovementType();
    }
}
