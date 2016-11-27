package KStatistic;

import Helper.Helper;

public class KStatistic {
    public int searchK(int[] arr, int k) {
        int left = 0;
        int mid;
        int right = arr.length - 1;
        while (true) {
            mid = partition(arr, left, right);
            if (k==mid) return arr[mid];
            else if (k < mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }

    //используем разделение массива как в quickSort'е
    private static int partition(int[] arr, int left, int right) {
        int index =(left+right)/2;
        int pivot = arr[index];
        Helper.swap(arr, index, right);
        for (int i = index = left; i < right; ++i) {
            if (arr[i] <= pivot) {
                Helper.swap(arr, index++, i);
            }
        }
        Helper.swap(arr, index, right);
        return (index);
    }
}
