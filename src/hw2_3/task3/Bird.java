package hw2_3.task3;

// птицы

public abstract class Bird extends Animal {
    private String environment;
    private static final String DEFAULT_ENVIRONMENT = "на деревьях";

    public String getEnvironment() {
        return environment;
    }

    public Bird(String name, int age, String environment) {
        super(name, age);
        setEnvironment(environment);
    }

    public void setEnvironment(String environment) {
        this.environment = isValid(environment) ? environment : DEFAULT_ENVIRONMENT;
    }

    public void hunter() {
        System.out.println(getName() + " охотится на насекомых");
    }
}
