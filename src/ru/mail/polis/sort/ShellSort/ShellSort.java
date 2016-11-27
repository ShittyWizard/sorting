package ShellSort;

public class ShellSort {
    public int[] shellSort(int arr[]) {
        for (int i = arr.length / 2; i > 0; i /= 2) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i];
                int k;
                for (k = j; k >= j; k -= i) {
                    if (temp < arr[k - i]) {
                        arr[k] = arr[k - i];
                    } else {
                        break;
                    }
                }
                arr[k] = temp;
            }
        }
        return arr;
    }
}
