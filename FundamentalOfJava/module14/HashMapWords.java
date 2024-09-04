import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMapWords {
    private static HashMap<String, String> dictionary;

    public HashMapWords(){
        dictionary = new HashMap<>();

        getWords();
    }

    public void getWords(){
        try(BufferedReader br = new BufferedReader(new FileReader("words.txt"))){
            String line;

            while((line = br.readLine()) != null){
                String[] parts = line.split("\\d+\\.\\s+|\\t");
                // line = parts[1];

                // parts = line.split("\\s* \\s*", 2);
                // if(parts.length < 2){
                //     parts = line.split("\\s*", 2);
                // }

                String englishPart = null, koreanParts = null;
                for(String s: parts){
                    if(englishPart == null){
                        if(!s.equals("")){
                            englishPart = s.trim();
                        }
                    } else{
                        if(!s.equals("")){
                            if(koreanParts == null)
                                koreanParts = s.trim();
                            else{
                                koreanParts = koreanParts.concat(s);
                            }
                        }
                    }
                }
                if(koreanParts == null){
                    parts = englishPart.split("\\s");

                    englishPart = null; koreanParts = null;
                    for(String s: parts){
                        if(englishPart == null){
                            if(!s.equals("")){
                                englishPart = s.trim();
                            }
                        } else{
                            if(!s.equals("")){
                                if(koreanParts == null)
                                    koreanParts = s.trim();
                                else{
                                    koreanParts = koreanParts.concat(s);
                                }
                            }
                        }
                    }
                }

                // for(String s: parts){
                //     System.out.println(s);
                // }
                // System.out.println();

                dictionary.put(englishPart, koreanParts);
            }
        } catch(IOException e){
            System.out.println("error occurred");
            e.printStackTrace();
            return;
        }
    }

    public static void main(String[] args) throws IOException{
        new HashMapWords();

        String input;
        System.out.println("Input Word For Search:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(!(input = br.readLine()).equals("exit()")){
            String output = dictionary.getOrDefault(input, "Invalid Data");
            System.out.println(": " + output + '\n');

            System.out.println("\nInput Word For Search: ");
        }
    }
}
