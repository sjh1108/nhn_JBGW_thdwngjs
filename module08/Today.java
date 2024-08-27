public class Today {
    int i;
    Today t;

    public String getToday(){
        return "2024-08-27";
    }
}

class Test{
    public static void main(String[] args){
        Today t = new Today();
        System.out.println(t.t);
        System.out.println(t.getToday());
    }
}
