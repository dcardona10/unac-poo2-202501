package grades;

public class SubjectByStudent {

    private Student student;
    private Subject subject;
    private double grade;

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
        return "SubjectByStudent{" +
                "student=" + student.toString() +
                ", subject=" + subject.toString() +
                ", grade=" + grade +
                '}';
    }
}
