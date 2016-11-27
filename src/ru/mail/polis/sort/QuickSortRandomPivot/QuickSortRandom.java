package QuickSortRandomPivot;

import Helper.Helper;

import java.util.Random;

public class QuickSortRandom {
    public int[] quickSortRandom(int[] arr) {
        quickSortHelp(arr, 0, arr.length-1);
        return arr;
    }

    static void quickSortHelp(int[] arr, int start, int end){
        if (start >= end) return;
        Random random = new Random();
        int tmp = random.nextInt(end - start) + start;
        int pivot=arr[tmp];
        int b = start;
        int j = start;

        Helper.swap(arr, start, tmp);

        for(int i = start + 1; i <=end ; i++){
            if (arr[i] < pivot) {
                Helper.swap(arr, ++j, i);
            }
            else if (arr[i] == pivot){
                Helper.swap(arr, i, ++j);
                Helper.swap(arr, ++b, j);
            }
        }

        int del=j;
        for(int i = start; i <= b; i++) {
            Helper.swap(arr, i, j);
            j--;
        }

        quickSortHelp(arr, start, j);
        quickSortHelp(arr,del+1, end);
    }
}
