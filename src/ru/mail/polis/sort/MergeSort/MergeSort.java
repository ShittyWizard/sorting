package MergeSort;

public class MergeSort {
    private int[] num;
    private int[] helper;

    public int[] sortMerge(int[] arr) {
        this.num = arr;
        this.helper = new int[arr.length];
        mergesort(0, arr.length - 1);
        return  arr;
    }

    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergesort(low, middle);
            mergesort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        for (int i = low; i <= high; i++) {
            helper[i] = num[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                num[k] = helper[i];
                i++;
            } else {
                num[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            num[k] = helper[i];
            k++;
            i++;
        }

    }
}