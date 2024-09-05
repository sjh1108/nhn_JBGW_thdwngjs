

public class BubbleSort{
    public static <T extends Comparable<T>> void method(T[] arr){
        boolean flag = true;
        int len = arr.length;
        while(flag){
            flag = false;
            for(int i = 0; i < len-1; i++){
                if(arr[i].compareTo(arr[i+1]) > 0){
                    T tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;

                    flag = true;
                }
            }
        }
    }
    public static void main(String[] args){
        Integer[] arr = new Integer[3];

        arr[0] = 3;
        arr[1] = 1;
        arr[2] = 2;

        method(arr);

        for(Integer i: arr){
            System.out.println(i);
        }
    }
}
