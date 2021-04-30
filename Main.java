public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Emre Can");
        student.setLastName("ÇAKIR");
        student.setPayment(0);
        student.setTakenCourses("Java");
        student.setGmail("emreecann28@gmail.com");
        student.setAddressInfo("Adres bilgileri");
        student.setCreditCard("Kredi karti bilgileri");

        Instructor instructor = new Instructor();
        instructor.setName("Engin");
        instructor.setLastName("Demirog");
        instructor.setGmail("gmail bilgileri");
        instructor.setCoursesTaught("java, c#, python, .net");
        instructor.setAddressInfo("adres bilgileri");

        StudentManager studentManager = new StudentManager();
        studentManager.addCourse(student);
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
    }
}
