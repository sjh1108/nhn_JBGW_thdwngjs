import java.util.Arrays;

public class Anagram {
    public static char[] toCharArray(String value){
        char[] result = new char[value.length()];

        for(int i = 0; i < value.length(); i++){
            result[i] = value.charAt(i);
        }

        return result;
    }

    public static char[] removeNotAlpha(char[] value){
        char[] result = new char[value.length];

        int tmp = 0;
        for(char c : value){
            if(Character.isAlphabetic(c))
                result[tmp++] = c;
        }
        result = Arrays.copyOf(result, tmp);

        return result;
    }

    public static char[] toLowerCase(char[] value){

        for(int i = 0; i < value.length; i++){
            char c = value[i];
            if(Character.isUpperCase(c)){
                value[i] = Character.toLowerCase(c);
            }
        }
        return value;
    }

    public static char[] arraySort(char[] value){
        boolean flag = false;

        do{
            flag = false;
            for(int i = 0; i < value.length-1; i++){
                if((int) value[i] < (int) value[i+1]){
                    char tmp = value[i];
                    value[i] = value[i+1];
                    value[i+1] = tmp;

                    flag = true;
                }
            }
        } while(flag);

        return value;
    }

    public static boolean isAnagram(char[] value, char[] anagram){
        if(value.length != anagram.length){
            return false;
        }

        for(int i = 0; i < value.length; i++){
            if(value[i] != anagram[i]) return false;
        }

        return true;
    }

    public static boolean isAnagram(String... value){
        if(value[0].length() != value[1].length()) return false;

        int[] alpha = new int[26];
        for(char c: value[0].toCharArray()){
            if(Character.isAlphabetic(c)){
                c = Character.toLowerCase(c);
                alpha[(int)(c - 'a')]++;
            }
        }
        for(char c: value[1].toCharArray()){
            if(Character.isAlphabetic(c)){
                c = Character.toLowerCase(c);
                alpha[(int)(c - 'a')]--;

                if(alpha[(int)(c - 'a')] < 0) return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter First String");
        String value = sc.nextLine();

        System.out.println("Enter Anagram String");
        String anagram = sc.nextLine();

        sc.close();

        char[] v = toCharArray(value);
        v = removeNotAlpha(v);
        v = toLowerCase(v);
        v = arraySort(v);

        char[] a = toCharArray(anagram);
        a = removeNotAlpha(a);
        a = toLowerCase(a);
        a = arraySort(a);

        System.out.println(value + " and " + anagram + " is Anagram?");
        System.out.println(isAnagram(v, a));
        System.out.println(isAnagram(new String[]{value, anagram}));
    }
}
