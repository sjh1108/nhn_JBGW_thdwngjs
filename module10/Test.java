public class Test {
    public static void main(String[] args){
        Group group = new Group(10);
        group.add(new Person(1, "Celine"));
        group.add(new Person(2, "James"));
        group.add(new Person(3, "Jason"));

        System.out.println(group.get(2));
    }
}
