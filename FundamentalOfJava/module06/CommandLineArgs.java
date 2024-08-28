public class CommandLineArgs {
    public static void main(String[] args){
        System.out.println("Using for: ");
        int i = 0;
        for(String argc : args){
            System.out.println(i++ + ": " + argc);
        }
    }
    
}
