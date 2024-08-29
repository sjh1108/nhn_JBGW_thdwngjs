import java.util.List;
import java.util.ArrayList;

public class Test {
    public static <T> List<T> arrayToList(T[] array){
        List<T> list = new ArrayList<>();
        for(T i : array){
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args){
        Integer[] array = {1, 2, 3};
        arrayToList(array);
    }
}
