package MergeSort;


import TestHelper.TestHelper;
import org.junit.Test;

public class MergeSortTest {
    @Test
    public void testMergeSort() throws Exception{
        TestHelper testHelper = new TestHelper();
        MergeSort mergesort = new MergeSort();
        int n = 1000;
        int[] arr = testHelper.gen(n);
        testHelper.randomPermutation(arr);
        arr = mergesort.sortMerge(arr);
        assert(testHelper.isSorted(arr));
    }
}
