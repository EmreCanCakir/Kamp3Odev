public class Student extends User {
    private int payment;
    private String takenCourses;


    public Student() {

    }

    public Student(int payment, String takenCourses) {
        super();
        this.setPayment(payment);
        this.setTakenCourses(takenCourses);
    }


    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getTakenCourses() {
        return takenCourses;
    }

    public void setTakenCourses(String chosenCourses) {
        this.takenCourses = chosenCourses;
    }
}
