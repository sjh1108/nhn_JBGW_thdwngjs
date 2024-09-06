import java.util.function.BinaryOperator;

public class OperatorNode implements Node{
    char operator;
    Node left;
    Node right;
    BinaryOperator<Integer> op;

    public OperatorNode(Node left, Node right, BinaryOperator<Integer> op, char operator){
        this.left = left;
        this.right = right;
        this.op = op;

        this.operator = operator;
    }

    @Override
    public int evaluation(){
        return op.apply(left.evaluation(), right.evaluation());
    }

    @Override
    public String toString(){
        return "(" + left + "," + operator + "," + right + ")";
    }
}
