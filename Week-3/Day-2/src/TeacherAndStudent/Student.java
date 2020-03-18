package TeacherAndStudent;

public class Student {

    public Student(){

    }

    public void learn(){
        System.out.println("...The student learns something new!");
    }

    public void question(Teacher teacher) {

        teacher.answer();
    }



}
