import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Student ID: ");
            String studentId = input.next();
            Student student = getStudentById(studentId);
            System.out.print("Subject Code: ");
            String subjectCode = input.next();
            Subject subject = getSubjectByCode(subjectCode);
            System.out.print("Grade: ");
            double grade = input.nextDouble();
            StudentBySubject sbs = generateStudentBySubject(student, subject, grade);
            System.out.println("Student by Subject record created: " + sbs.toString());
        } catch (GradeOutOfBoundsException e) {
            System.out.println("Student by Subject record was not created: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Program finished");
        }
    }

    private static StudentBySubject generateStudentBySubject(Student student, Subject subject, double grade) throws GradeOutOfBoundsException {
        if (grade < 0 || grade > 5) {
            throw new GradeOutOfBoundsException("Grade is out of allowed values: 0.0 - 5.0");
        } else {
            return new StudentBySubject(student, subject, grade);
        }
    }

    private static Student getStudentById(String id) {
        List<Student> studentById = getStudents().stream()
                .filter(s -> s.getId().equals(id))
                .toList();
        return studentById.get(0);
    }

    private static Subject getSubjectByCode(String code) {
        List<Subject> subjectByCode = getSubjects().stream()
                .filter(s -> s.getCode().equals(code))
                .toList();
        return subjectByCode.get(0);
    }

    private static List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("1147452", "Luis Paniagua"));
        students.add(new Student("1478484", "Karen Gomez"));
        students.add(new Student("1547556", "Daniel Pereira"));
        return students;
    }

    private static List<Subject> getSubjects() {
        List<Subject> subjects = new ArrayList<Subject>();
        subjects.add(new Subject("FI_IS_0301", "OOP-1"));
        subjects.add(new Subject("FI_IS_0302", "Databases"));
        return subjects;
    }
}
