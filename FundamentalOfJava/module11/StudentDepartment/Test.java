package StudentDepartment;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args){
        Department d = new Department(1, "Computer Engineering");
        d.add(new Student(3, "Celine", "010-1111-2222"));
        d.add(new Student(2, "Jason", "010-3333-4444"));
        d.add(new Student(1, "James", "010-2222-3333"));
        
        Collections.sort(d);
        
        for(Student s : d){
            System.out.println(s);
        }
    }
}
