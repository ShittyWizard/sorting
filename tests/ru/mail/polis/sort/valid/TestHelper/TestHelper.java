package TestHelper;

import java.util.Random;


public class TestHelper {
    public void randomPermutation(int[] arr){
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--){
            int j = random.nextInt(i);
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    public boolean isSorted(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] <= arr[i+1]){
                count++;
            }
        }
        if (count == arr.length-1){
            return true;
        } else {
            return false;
        }

    }

    public int[] gen(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = i;
        }
        return arr;
    }
}
