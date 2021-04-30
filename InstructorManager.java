public class InstructorManager extends UserManager {

    public void add(Instructor instructor){
        System.out.println("Vermek istediğiniz yeni ders :"+instructor.getCoursesTaught());
    }
}
