import java.io.*;

public class FileDetails {
public static void summerize(char[] contents){
    int vowel = 0, consonants = 0, lines = 0;

    for(char c: contents){
        if(Character.isLetter(c)){
            if("AEIOUaeiou".indexOf(c) != -1){
                vowel++;
            } else{
                consonants++;
            }
        } else if(c == '\n'){
            lines++;
        }
    }

    System.out.println("\nTotal character count: " + contents.length);
    System.out.println("Vowel Counts: " + vowel);
    System.out.println("Consonants Counts: " + consonants);
    System.out.println("Lines Counts: " + lines);
}
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage: java FileDetails FileName");
            return;
        }
        String fileName = args[0];
        File file = new File(fileName);
        try(FileInputStream stream = new FileInputStream(file)){
            char[] contents = new char[(int)file.length()];

            for(int i = 0; i < contents.length; i++){
                contents[i] = (char)stream.read();
            }

            for(char c: contents){
                System.out.print(c);
            }

            System.out.println();
            summerize(contents);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}