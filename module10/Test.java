public class Test {
    public static void main(String[] args){
        Group group = new Group(10);
        group.add(new Person(1, "Celine"));
        group.add(new Person(2, "James"));
        group.add(new Person(3, "Jason"));

        for(int i = 0; i < group.size(); i++){
            System.out.println(group.get(i));
        }

        MVG mvg = new MVG(new Person(1, "Celine"), new Person(2, "James"), new Person(3, "Jason"));
    }
}
