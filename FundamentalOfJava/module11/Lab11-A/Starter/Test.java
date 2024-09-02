import department.Department;
import student.CollegeBoy;

class AClass{

    public AClass() {
    }
}

class BClass{
    public BClass clone(){
        return new BClass();
    }
}

public class Test {
    AClass[] aclass = new AClass[1];
    BClass bclass = new BClass();

    void setAclass(AClass aclass){
        this.aclass[0] = aclass;
    }

    AClass getAClass(){
        return aclass[0];
    }

    void setBClass(BClass bclass){
        this.bclass = bclass;
    }

    BClass getBClass(){
        return bclass.clone();
    }
    public static void main(String[] args) {
        Department<CollegeBoy> department = new Department<>(1, "Computer Engineering");

        department.addStudent(new CollegeBoy(1, "Celine", "010-1111-2222"));
        department.addStudent(new CollegeBoy(2, "James", "010-2222-3333"));

        for(Object o: department) {
            System.out.println(o);
        }

    }
}
