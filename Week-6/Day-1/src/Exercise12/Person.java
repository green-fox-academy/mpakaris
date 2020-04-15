package Exercise12;

public class Person {

    private String name, gender;
    private int height;
    private Double mass;

    public Person(String name, int height, Double mass, String gender) {
        this.name = name;
        this.height = height;
        this.gender = gender;
        this.mass = mass;
    }

    public Person(String name, int height, String gender) {
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public Person (String name) {
        this.name = name;
    }

    public Double getMass() {
        return this.mass;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public String getGender() {
        return this.gender;
    }
}
