package MSDBinary;

import Helper.Helper;

public class MSDBinary {
    public int[] sort(int[] arr){
        if (arr==null){
            return new int[0];
        }
        sortMSD(arr,0,arr.length-1,0x40000000);
        return arr;
    }

    public void sortMSD(int[] arr,int left, int right, int bit){
        if (bit==0){
            return;
        }
        if (right-left+1<2 || right<1){
            return;
        }
        int last = left;
        for (int i=left; i<=right; i++){
            if((arr[i] & bit) == 0){
                Helper.swap(arr,last++,i);
            }
        }
        sortMSD(arr, left, last-1, bit >> 1);
        sortMSD(arr, last, right, bit >> 1);
    }

}
