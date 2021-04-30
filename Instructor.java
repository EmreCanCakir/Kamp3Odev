public class Instructor extends User {
    private String coursesTaught;

    public Instructor(String coursesTaught) {
        super();
        this.setCoursesTaught(coursesTaught);
    }
    public Instructor(){

    }

    public String getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}
