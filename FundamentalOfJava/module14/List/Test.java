package List;
public class Test {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for(String s : list){
            System.out.println(s);
        }
    }
}
