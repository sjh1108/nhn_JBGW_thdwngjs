import java.util.Scanner;

public class JBGW08_027_AST{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AST AST = new AST();

        while(true){
            System.out.print("> ");

            String expression = sc.nextLine();
            if(expression.equals("exit()")){
                break;
            }

            try{
                Node ast = AST.generateAST(expression);
                // System.out.println(ast + " = " + ast.evaluation());
                System.out.println(ast.evaluation());
            } 
            catch(InvalidExpressionException e){
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}