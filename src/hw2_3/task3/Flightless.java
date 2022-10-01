package hw2_3.task3;

// нелетающие

public final class Flightless extends Bird {

    private String movementType;
    private static final String DEFAULT_MOVEMENT = "ходит";

    public Flightless(String name, int age, String environment, String movementType) {
        super(name, age, environment);
        setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = isValid(movementType) ? movementType : DEFAULT_MOVEMENT;
    }

    public void walk() {
        System.out.println(getName() + " гуляет");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " клюёт насекомых");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
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
