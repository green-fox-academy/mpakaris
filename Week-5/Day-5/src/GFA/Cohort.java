package GFA;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private String nameCohort;
    private List<Student> listStudents;
    private List<Mentor> listMentors;

    public Cohort (String name) {
        this.nameCohort = name;
        this.listStudents = new ArrayList<>();
        this.listMentors = new ArrayList<>();
    }

    public void addStudent(Student studentToAdd) {
        listStudents.add(studentToAdd);
    }

    public void addMentor(Mentor mentorToAdd) {
        listMentors.add(mentorToAdd);
    }

    public void info() {
        System.out.println("The cohort " + this.nameCohort + " has " + this.listStudents.size() + " students and " + listMentors.size() + " mentors.");
    }
}
