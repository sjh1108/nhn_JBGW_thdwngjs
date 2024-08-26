public class Sample {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 2, 0, 7, 4, 9, 8, 6};
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean flag = true;
        loop:
        for(int t = 0; t < arr.length; t++){
            if(!flag) break loop;
            System.out.println("Loop " + t + ":");

            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            flag = false;
            for(int i = 0; i < arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    flag = true;
                }
            }

        }

        System.out.println("\nFinally");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
