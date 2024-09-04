import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListWords {
    private static ArrayList<String[]> dictionary;
    public ArrayListWords(){
        dictionary = new ArrayList<>();

        getWords();
    }

    public void getWords(){
        try(BufferedReader br = new BufferedReader(new FileReader("words.txt"))){
            String line;

            while((line = br.readLine()) != null){
                String[] parts = line.split("\\d+\\.\\s+|\\t");

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

                String[] appendStrings = {englishPart, koreanParts};

                dictionary.add(appendStrings);
            }
        } catch(IOException e){
            System.out.println("error occurred");
            e.printStackTrace();
            return;
        }

        // books.sort((b1, b2) -> b1.getPrice().compareTo(b2.getPrice()));
        dictionary.sort((s1, s2) -> s1[0].compareTo(s2[0]));
    }

    public static void sort(Comparator<String[]> comparator) {
        Collections.sort(dictionary, comparator);
    }

    public static String binarySearchString(String input){
        String output = null;

        int l = 0, r = dictionary.size();
        while(l <= r){
            int mid = l + (r-l) / 2;

            String[] gets = dictionary.get(mid);
            String get = gets[0];

            if(get.equals(input)){
                return gets[1];
            } else if(get.compareTo(input) < 0){
                l = mid + 1;
            } else{
                r = mid - 1;
            }
        }

        return output;
    }

    public static void main(String[] args) throws IOException{
        new ArrayListWords();

        // for(String[] arr: dictionary){
        //     System.out.println(arr[0] + ": " + arr[1]);
        // }
        String input = null;
        System.out.println("Input Word For Search:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(!(input = br.readLine()).equals("exit()")){
            String output = binarySearchString(input);

            if(output == null){
                System.out.println("Invalid Data");
            } else{
                System.out.println(": " + output);
            }

            System.out.println("\nInput Word For Search: ");
        }
    }
}
