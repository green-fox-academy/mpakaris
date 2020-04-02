package GFA;

public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi I am " + super.getName() + ", a " + super.getAge() + " year old " + super.getGender()
                + " who represents " + this.company + " and hired " + this.hiredStudents + " so far.");
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior SW-Developers.");
    }

    public void hire() {
        this.hiredStudents++;
    }
}
