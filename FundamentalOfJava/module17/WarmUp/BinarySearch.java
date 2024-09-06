import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        for(int i = 0; i < 30; i++){
            int random = (int)(Math.random() * 100);

            if(!list.contains(random)){
                list.add(random);
            }
        }

        Collections.sort(list);

        System.out.println(binarySearch(list, 3));
        System.out.println(binarySearch(list, System.in.read() - '0'));

        System.out.println("List:");
        for(int i : list){
            System.out.print(i + " ");
        }
    }

    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T target){
        int left = 0;
        int right = list.size() - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(list.get(mid).compareTo(target) == 0){
                return mid;
            } else if(list.get(mid).compareTo(target) < 0){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
