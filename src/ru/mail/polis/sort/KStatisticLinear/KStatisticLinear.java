package KStatisticLinear;


import Helper.Helper;

public class KStatisticLinear {

    public int searchKLinear(int arr[], int k) {
        kElem(arr, k);
        return arr[k];
    }

    private static void insertionSort(int[] arr, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                Helper.swap(arr, j - 1, j);
            }
        }
    }

    private static int findMed(int[] arr,int left, int right) {
        int res;
        int i = left;
        int j = 0;
        int[] meds = new int[(right + 4) / 5];
        while (i+4 < right) {
            insertionSort(arr, i, i + 4);
            meds[j++] = arr[i + 2];
            i += 5;
        }
        if ((right%5)!=0){
            if (j!=0) i-=5;
            insertionSort(arr, i, arr.length-1);
            meds[j++] = arr[(arr.length-1-i)/2];
        }
        if (j==1) {
            res=arr[0];
            return res;
        }
        res=findMed(meds, 0,meds.length);
        return res;
    }

    private static void kElem(int[] array, int k) {

        int left = 0;
        int right = array.length - 1;
        while (right > left) {
            int pivot = findMed(array,left, right+1);
            int mid = partition(array, left, right, pivot);
            if (k < mid) right = mid - 1;
            else if (k > mid) left = mid + 1;
            else return;
        }
    }


    private static int partition(int[] arr, int left, int right, int p) {
        if (left > right) return right;
        int i = left;
        int j = right;
        while (i <= j) {
            while (i <= j && arr[i] < p) i++;
            while (i <= j && arr[j] > p) j--;
            if (i >= j) break;
            Helper.swap(arr, i++, j--);
        }
        return i;
    }
}
