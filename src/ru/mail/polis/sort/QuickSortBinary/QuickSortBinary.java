package QuickSortBinary;

import Helper.Helper;

public class QuickSortBinary {

    public int[] sort(int[] arr){
        if (arr == null) {
            return new int[0];
        }
        QSort(arr, 0, arr.length - 1, 31);
        return arr;
    }

    public static void QSort(int[] arr, int left, int right, int w){
        if (left >= right || w<0) {
            return;
        }
        int i = left;
        int j = right;
        while (i <= j){
            while ((i <=right) && Digit(arr[i], w) == 0 ){
                i++;
            }
            while ((j >=left) && Digit(arr[j], w) == 1){
                j--;
            }
            if (i <= j){
                Helper.swap(arr, i++, j--);
            }
        }
        QSort(arr, left, j, w - 1);
        QSort(arr, j + 1, right, w - 1 );
    }

    private static int Digit(int n, int k) {
        return (n >> k) & 1;
    }
}
