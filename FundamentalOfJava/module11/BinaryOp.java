@FunctionalInterface
public interface BinaryOp {
    public int apply(int i, int j);
}

@FunctionalInterface
interface RunSomething{
    void doIt();
}

class Hello{
    void abc(){
        System.out.println("Hello");
    }
}

class Test{
    public static void main(String[] args){
        Hello h = new Hello();
        RunSomething r = h::abc;
        r.doIt();
    }
}