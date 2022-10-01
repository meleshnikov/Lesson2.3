package hw2_3.task3;

//травоядные

public final class Herbivore extends Mammals {

    private String food;
    private static final String DEFAULT_FOOD = "траву";

    public Herbivore(String name, int age, String environment, double velocity, String food) {
        super(name, age, environment, velocity);
        setFood(food);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = isValid(food) ? food : DEFAULT_FOOD;
    }

    public void graze() {
        System.out.println(getName() + " пасется " + getEnvironment());
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит " + getEnvironment());
    }

    @Override
    public void go() {
        System.out.println(getName() + " ходит на четырех лапах");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " гуляет " + getEnvironment());
    }

    @Override
    public String toString() {
        return super.toString()
                + ", пасется " + getEnvironment()
                + ", ест " + getFood()
                + ", скорость - " + getVelocity() + " км/ч";
    }

}
