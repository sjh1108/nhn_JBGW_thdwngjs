@FunctionalInterface
public interface BinaryOp {
    public int apply(int i, int j);
}

class Adder implements BinaryOp{
    public int apply(int i, int j){
        return i + j;
    }
}

class Multiplier implements BinaryOp{
    public int apply(int i, int j){
        return i * j;
    }
}

class Test{
    public static int calc(BinaryOp binder, int i, int j){
        return binder.apply(i, j);
    }

    public static void main(String[] args){
        BinaryOp binder = new BinaryOp(){
            public int apply(int i, int j){
                return i + j;
            }
        };

        BinaryOp binder2 = (x, y) -> x + y;
        
        System.out.println(calc(binder, 1, 2));
        System.out.println(calc(binder2, 1, 2));
        System.out.println(calc((x, y) -> x + y, 1, 2));
    }
}