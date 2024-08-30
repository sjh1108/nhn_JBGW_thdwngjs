import java.util.List;

public class Util {
    public static <T extends Comparable<T>> void bubbleSort(T[] array){
        int n = array.length;
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); j++){
                if(array[j-1].compareTo(array[j]) > 0){
                    T temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void printAllElements(List<?> list){
        list.forEach(System.out::println);
    }
}
