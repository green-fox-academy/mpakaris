package GreenFox;

public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;

    public Student(){
        super.setName("Jane Doe");
        super.setAge(30);
        super.setGender("Female");
        this.previousOrganization = "'The School of Life'";
        this.skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public void skipDays(int numberOfDays){
        this.skippedDays += numberOfDays;
    }

    @Override
    public void getGoal(){
        System.out.println("My goal is to Be a Junior SW Developer.");
    }

    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + super.getName() +
                ", a " + super.getAge() + " year old " +
                super.getGender() + " from " + this.previousOrganization +
                " who skipped " + this.skippedDays + " days from the course already.");
    }
}
