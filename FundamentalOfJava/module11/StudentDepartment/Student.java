package StudentDepartment;
public class Student implements Comparable<Student>{
    int no;
    String name;
    String phoneNumber;

    public Student(int no, String name, String phoneNumber){
        this.no = no;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return this.no + ", " + this.name + ", " + this.phoneNumber;
    }

    public int compareTo(Student s){
        return this.no - s.no;
    }
}
