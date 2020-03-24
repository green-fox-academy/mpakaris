package GreenFox;

public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    public Sponsor(){
        super.setName("Jane Doe");
        super.setAge(30);
        super.setGender("Female");
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company){
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public void hire(){
        this.hiredStudents++;
    }

    @Override
    public void getGoal(){
        System.out.println("My Goal is to Hire brilliant Junior SW Developers.");
    }

    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + super.getName() +
                ", a " + super.getAge() + " year old " +
                super.getGender() + ", who represents " +
                this.company + " and hired " + this.hiredStudents +
                " students so far.");
    }










}
