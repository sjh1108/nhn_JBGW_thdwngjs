import java.util.function.BinaryOperator;

public class AST {
    private int index;
    private String[] exStrings;

    // public AST(){
    //     try{
    //         System.out.println(generateAST("1 + 2"));
    //     } catch(InvalidExpressionException e){
    //         System.out.println(e.getMessage());
    //     }
    // }

    // method to generate AST
    public Node generateAST(String expression) throws InvalidExpressionException {
        this.exStrings = expression.split("\\s");

        this.index = 0;

        Node result = parseAdderSubtractor();
        if(index != exStrings.length){
            throw new InvalidExpressionException("Invalid expression: " + expression);
        }

        return result;
    }
    
    // method to parse Adder and Subtractor
    private Node parseAdderSubtractor() throws InvalidExpressionException{
        Node left = parseMultiplicatorDivider();

        while(index < exStrings.length && (exStrings[index].equals("+") || exStrings[index].equals("-"))) {
            char operator = exStrings[index].charAt(0);
            index++;
            Node right = parseMultiplicatorDivider();

            BinaryOperator<Integer> op = null;
            if(operator == '+'){
                op = (a, b) -> a + b;
            } else{
                op = (a, b) -> a - b;
            }

            left = new OperatorNode(left, right, op, operator);
        }

        return left;
    }

    // method to parse Multiplicator and Divider
    private Node parseMultiplicatorDivider() throws InvalidExpressionException{
        Node left = parseNumber();

        while(index < exStrings.length && (exStrings[index].equals("*") || exStrings[index].equals("/"))){
            char operator = exStrings[index].charAt(0);
            index++;
            Node right = parseNumber();

            BinaryOperator<Integer> op = null;
            if(operator == '*'){
                op = (a, b) -> a * b;
            } else{
                op = (a, b) -> a / b;
            }

            left = new OperatorNode(left, right, op, operator);
        }

        return left;
    }

    // method to parse Number
    private Node parseNumber() throws InvalidExpressionException{
        if(index >= exStrings.length){
            throw new InvalidExpressionException("Unexpected end of expression");
        }

        String str = exStrings[index];
        try{
            int value = Integer.parseInt(str);
            index++;

            return new NumberNode(value);
        } catch(NumberFormatException e){
            throw new InvalidExpressionException("Invalid Input: " + str);
        }
    }
}
