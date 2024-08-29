public class StackADT{
    int tmp;
    int[] stack;

    public StackADT(){
        this.tmp = -1;
        this.stack = new int[5];
    }
    public StackADT(int size){
        this.tmp = -1;
        this.stack = new int[size];
    }

    public boolean isEmpty(){
        if (this.tmp == -1){
            return true;
        } else{
            return false;
        }
    }

    public void push(int item){
        stack[++this.tmp] = item;
    }

    public int pop(){
        return stack[this.tmp--];
    }

    public int top(){
        return stack[this.tmp];
    }
}