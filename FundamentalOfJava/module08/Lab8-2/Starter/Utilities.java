public class Utilities {
    public static int max(int i, int j) {
        if (i > j)
            return i;
        else 
            return j;
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static int swap2(int i, int j) {
        return i;
    }

    public static String reverseString(String s) {
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }

        return result;
    }

    //
    // To-do: add isCharSequence method here.
    // 
    public static boolean isCharSequence(Object object){
        if(object instanceof CharSequence){
            return true;
        } else{
            return false;
        }
    }

    //
    // To-do add display method here.
    //

    public static void display(Object item){
        IPrintable printable;
        if(item instanceof IPrintable){
            printable = (IPrintable)item;
            printable.print();
        } else{
            System.out.println(item.toString());
        }
    }
}