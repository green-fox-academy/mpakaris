package GreenFox;

public class Mentor extends Person {

    private String level;

    public Mentor(){
        super.setName("Jane Doe");
        super.setAge(30);
        super.setGender("Female");
        this.level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level){
        super(name, age, gender);
        this.level = level;
    }

    @Override
    public void getGoal(){
        System.out.println("My goal is to Educate brilliant Junior SW Developers");
    }

    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + super.getName() +
                ", a " + super.getAge() + " year old " +
                super.getGender() + ", " + this.level + " mentor.");
    }

}
