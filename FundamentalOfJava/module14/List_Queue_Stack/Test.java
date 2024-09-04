public class Test {
    public static void main(String[] args){
        List<String> list = new LinkedList<>();

        list.add("Celine:");
        list.add("HI");
        list.add("I'm Celine");

        for(String s : list){
            System.out.println(s);
        }

        System.out.println("\nRemove Index 0");
        list.remove(0);
        for(String s: list){
            System.out.println(s);
        }

        System.err.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
