public class NumberNode implements Node {
    int value;

    public NumberNode(int value){
        this.value = value;
    }

    @Override
    public int evaluation(){
        return value;
    }

    @Override
    public String toString(){
        return "(" + this.value + ")";
    }
}
