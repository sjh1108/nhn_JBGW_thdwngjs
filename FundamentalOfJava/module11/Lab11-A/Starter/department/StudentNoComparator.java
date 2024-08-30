package department;

import java.util.Comparator;
import student.Student;

public class StudentNoComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getStudentNo() - s2.getStudentNo();
    }
}
