package GreenFox;

public class Person {

    private String name;
    private int age;
    private String gender;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender);
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the Moment!");
    }


}
