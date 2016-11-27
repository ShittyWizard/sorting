package Helper;

import java.util.Random;

public class Helper {
        public static int[] gen(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = i++;
            }
            randomPermutation(arr);
            return arr;
        }

        public static void swap(int[] arr, int i,int j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        public static void swap(String[] arr, int i, int j){
            String tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

    public static void randomPermutation(int[] arr){
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--){
            int j = random.nextInt(i);
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}
