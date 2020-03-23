package GreenFox;

import java.util.ArrayList;

public class Cohort extends Person{

    private String name;
    private ArrayList<Student> studentList;
    private ArrayList<Mentor> mentorList;

    public Cohort(String name){
        this.name = name;
        this.studentList = new ArrayList<>();
        this.mentorList= new ArrayList<>();
    }

    public void addStudent(Student Student){
        this.studentList.add(Student);
    }

    public void addMentor(Mentor Mentor){
        this.mentorList.add(Mentor);
    }

    public void info(){
        System.out.println("The " + this.name + " cohort has " + this.studentList.size() + " students and " + this.mentorList.size() + " mentors.");
    }

}
