package grades;

import java.util.*;

public class Main {

    private static List<SubjectByStudent> subjectsByStudent = new ArrayList<SubjectByStudent>();

    public static void main(String[] args) {

        int option = -1;
        Scanner input = new Scanner(System.in);

        while (option != 0) {
            System.out.println("1. Create Subject by Student record");
            System.out.println("2. Search Student");
            System.out.println("3. Search Subject");
            System.out.println("0. Exit");
            option = input.nextInt();

            switch (option) {
                case 1:
                    SubjectByStudent sbs = new SubjectByStudent();
                    System.out.print("Insert Student Code: ");
                    String studentCode = input.next();
                    List<Student> studentSearch = getStudents().stream()
                            .filter(s -> s.getCode().equals(studentCode))
                            .toList();
                    if (!studentSearch.isEmpty()) {
                        sbs.setStudent(studentSearch.get(0));
                    }
                    System.out.print("Insert Subject Code: ");
                    String subjectCode = input.next();
                    List<Subject> subjectSearch = getSubjects().stream()
                            .filter(s -> s.getCode().equals(subjectCode))
                            .toList();
                    if (!subjectSearch.isEmpty()) {
                        sbs.setSubject(subjectSearch.get(0));
                    }
                    System.out.print("Insert grade: ");
                    double grade = input.nextDouble();
                    if (grade >= 0 && grade <= 5) {
                        sbs.setGrade(grade);
                        subjectsByStudent.add(sbs);
                    } else {
                        System.out.println("Error: invalid grade value");
                    }
                    subjectsByStudent.forEach(sb -> System.out.println(sb.toString()));
                    break;
                case 2:
                    System.out.println("Search Student by keyword: ");
                    String studentName = input.next();
                    List<Student> studentNameSearch = getStudents().stream()
                            .filter(s -> s.getName().contains(studentName))
                            .toList();
                    studentNameSearch.forEach(s -> System.out.println(s.toString()));
                    break;
                case 3:
                    System.out.println("Search Subject by keyword: ");
                    String subjectName = input.next();
                    List<Subject> subjectNameSearch = getSubjects().stream()
                            .filter(s -> s.getName().contains(subjectName))
                            .toList();
                    subjectNameSearch.forEach(s -> System.out.println(s.toString()));
                    break;
            }
        }
    }

    private static List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("11/12/2004", "Jose Gomez", "CC4414789"));
        students.add(new Student("14/08/2003", "Carolina Yepes", "CC4414791"));
        students.add(new Student("07/03/2004", "Andres Arcila", "CC4414793"));
        students.add(new Student("25/09/2003", "Gabriel Gomez", "CC4414794"));
        return students;
    }

    private static List<Subject> getSubjects() {
        List<Subject> subjects = new ArrayList<Subject>();
        subjects.add(new Subject("UN1001", "OOP 1"));
        subjects.add(new Subject("UN1002", "OOP 2"));
        subjects.add(new Subject("UN1003", "Databases"));
        return subjects;
    }
}
