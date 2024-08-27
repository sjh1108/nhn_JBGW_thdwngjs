public class StackADT{
    private int[] elements;
    private int index;

    public StackADT(int size){
        this.elements = new int[size];
        this.index = -1;
    }

    public boolean isEmpty(){
        if(this.index == -1){
            return true;
        } else{
            return false;
        }
    }

    public void push(int value){
        if(index == elements.length-1){
            System.out.println("Stack is Full");
        }
        this.index++;
        this.elements[this.index++] = value;
    }

    public int pop(){
        if(this.isEmpty()){
            System.out.println("Stack is Empty");
        }

        return this.elements[this.index--];
    }

    public int top(){
        return this.elements[this.index];
    }

    public static void main(String[] args){
        StackADT stack = new StackADT(5);

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}

class Node{
    int value;
    Node link;

    public Node(int value){
        this.value = value;
        link = null;
    }

    public Node(int value, Node link){
        this.value = value;
        this.link = link;
    }
}