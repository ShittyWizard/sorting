package insertionSort2;


public class insertionSort2 {
    public int[] insertSort2(int [] arr){
        for (int i= 1; i < arr.length; i++ ){
            int j = i - 1;
            int k = binarySearch(arr,arr[i],0,j+1);
            for (int m = j; m >= k; m--){
                int tmp = arr[m];
                arr[m] = arr[m+1];
                arr[m+1] = tmp;
            }
        }
        return arr;
    }

    private static int binarySearch(int[] a, int key,int index1, int index2){
        int left = index1-1;
        int right = index2+1;
        while( left < right - 1){
            int mid = (left + right)/2;
            if (a[mid] < key){
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
