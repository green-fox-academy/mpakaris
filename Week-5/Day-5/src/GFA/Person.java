package GFA;

public class Person {

    private String name, gender;
    private int age;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person () {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "Female";
    }

    public void introduce() {
        System.out.println("Hi I am " + this.name + ", a " + this.age + " year old " + this.gender);
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the Moment!");
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
