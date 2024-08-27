public class Today {
    int i;
    Today t;

    public String getToday(){
        return "2024-08-27";
    }
}

class Test{

    private static void preProcess(String s){
        s = s.trim().toUpperCase().replace(" ", "");
    }

    private static boolean compare(String left, String right){
        for(int i = 'A'; i <= 'Z'; i++){
            left = left.replace(Character.toString((char)i), "");
            right = right.replace(Character.toString((char)i), "");

            if(left.length() != right.length()) return false;
        }

        // 사실 얘만 있어도 되는데 위에 있는 애는 그냥 알파벳만 처리해줌
        for(int i = 0; i < left.length(); i++){
            char c = left.charAt(i);

            left = left.replace(Character.toString(c), "");
            right = right.replace(Character.toString(c), "");

            if(left.length() != right.length()) return false;
        }
        
        return true;
    }    

    public static boolean Anagram(String left, String right){
        preProcess(left);
        preProcess(right);

        if(left.length() != right.length()) return false;

        if(!compare(left, right)) return false;

        return true;
    }

    public static void main(String[] args){
        System.out.println(Anagram(args[0], args[1]));
    }
}
