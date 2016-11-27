package MSDString;

import Helper.Helper;

public class MSDString {
    private static int R = 256;        // кол-во символов
    private static final int M = 15;
    private static String[] aux;
    private static int charAt(String s, int d) {
        if (d < s.length())
            return s.charAt(d);
        else return -1;
    }
    public static String[] sort(String[] arr) {
        aux = new String[arr.length];
        sort(arr, 0, arr.length-1, 0);
        return arr;
    }
    private static void sort(String[] arr, int lo, int hi, int d) {  // Sort from a[lo] to a[hi], starting at the dth character.
        if (hi <= lo + M) {
            helpSort(arr, lo, hi, d);
            return;
        }
        int[] count = new int[R+2];        // Compute frequency counts.
        for (int i = lo; i <= hi; i++)
            count[charAt(arr[i], d) + 2]++;
        for (int r = 0; r < R+1; r++)      // Transform counts to indices.
            count[r+1] += count[r];
        for (int i = lo; i <= hi; i++)     // Distribute.
            aux[count[charAt(arr[i], d) + 1]++] = arr[i];
        for (int i = lo; i <= hi; i++)     // Copy back.
            arr[i] = aux[i - lo];
        // Recursively sort for each character value.
        for (int r = 0; r < R; r++)
            sort(arr, lo + count[r], lo + count[r+1] - 1, d+1);
    }

    public static void helpSort(String[] arr, int lo, int hi, int d) {  // Sort from a[lo] to a[hi], starting at the dth character.
        for (int i = lo; i <= hi; i++)
            for (int j = i; j > lo && less(arr[j], arr[j-1], d); j--) {
                Helper.swap(arr, j, j - 1);
            }
    }
    public static boolean less(String v, String w, int d) {
        return v.substring(d).compareTo(w.substring(d)) < 0;
    }
}
