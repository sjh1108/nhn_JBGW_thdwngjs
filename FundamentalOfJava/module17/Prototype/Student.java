@CreationType(type="Prototype")
public class Student implements DataBean{
    private int no;
    private String name;

    public Student(int no, String name){
        this.no = no;
        this.name = name;
    }

    public int getNo(){
        return this.no;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public DataBean clone() {
        return new Student(this.no, this.name);
    }
}