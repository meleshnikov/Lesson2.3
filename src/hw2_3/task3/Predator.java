package hw2_3.task3;

// хищники

public final class Predator extends Mammals {
    private String food;
    private static final String DEFAULT_FOOD = "мясо";

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = isValid(food) ? food : DEFAULT_FOOD;
    }

    public Predator(String name, int age, String environment, double velocity, String food) {
        super(name, age, environment, velocity);
        setFood(food);
    }

    public void hunter() {
        System.out.println(getName() + " охотится " + getEnvironment());
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
                + ", охотится " + getEnvironment()
                + ", ест " + getFood()
                + ", скорость - " + getVelocity() + " км/ч";
    }

}
