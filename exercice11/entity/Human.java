package projectjavajpoo.exercice11.entity;

public class Human {
    private static Human instance;

    private String firstName;

    private String lastName;

    private double size;

    private int age;

    private int health;

    private Human(String firstName, String lastName, double size, int age, int health) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.size = size;
        this.age = age;
        this.health = health;
    }

    public static synchronized Human getInstance() {
        if (instance == null) {
            instance = new Human("Default", "Default", 1.75, 20, 100);
        }
        return instance;
    }

    public String getFirstName() {
        return firstName;
    }

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Human setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public double getSize() {
        return size;
    }

    public Human setSize(double size) {
        this.size = size;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public int getHealth() {
        return health;
    }

    public Human setHealth(int health) {
        this.health = health;
        return this;
    }
}
