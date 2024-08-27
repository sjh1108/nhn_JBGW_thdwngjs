public class Student{
    private int no;
    private String name;

    public void setinfo(int no, String name){
        this.no = no; this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Student s = new Student();
        s.setinfo(this.no, this.name);

        return s;
    }

    public boolean equals(Student s){
        return (this.no == s.no && this.name == s.name);
    }

    public String toString(){
        return "No." + this.no + "\nName: " + this.name;
    }
}

class Test{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setinfo(1, "Celine");

        Student s2;
        try{
            s2 = (Student)s1.clone();
            System.out.println(s1.equals(s2));
        } catch(Exception e){}

    }
}