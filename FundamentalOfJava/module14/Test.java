public class Test {
    public static void main(String[] args){
        // ArrayList<Integer> list = new ArrayList<>();
        ArrayStack<Integer> stack = new ArrayStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        for(Integer i : stack){
            System.out.println(i);
        }
    }
}
