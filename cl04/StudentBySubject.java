public class StudentBySubject {

    private Student student;
    private Subject subject;
    private double grade;

    public StudentBySubject(Student student, Subject subject, double grade) {
        this.student = student;
        this.subject = subject;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentBySubject{" +
                "student=" + student.toString() +
                ", subject=" + subject.toString() +
                ", grade=" + grade +
                '}';
    }
}
