public class StudentManager extends UserManager{

    public void addCourse(Student student){
        System.out.println("Dersiniz eklendi :"+ student.getTakenCourses() );
    }
}
