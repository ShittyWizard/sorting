package QuickSortFixedPivot;

public class QuickSort {

    public int[] quickSort(int[] arr){
        quickSortHelp(arr, 0 , arr.length -1);
        return arr;
    }
    static void quickSortHelp(int[] arr, int low, int high) {
        int middle = (low + high)/2;
        int pivot = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSortHelp(arr, low, j);
        }
        if (high > i) {
            quickSortHelp(arr, i, high);
        }
    }
}
