package insertionSort1Test;

import TestHelper.TestHelper;
import insertionSort1.insertionSort;
import org.junit.Test;

public class insSort1Test {
    @Test
    public void testInsertSort() throws Exception{
        TestHelper testHelper = new TestHelper();
        insertionSort insSort = new insertionSort();
        int n = 1000;
        int[] arr = testHelper.gen(n);
        testHelper.randomPermutation(arr);
        arr = insSort.insertSort(arr);
        assert(testHelper.isSorted(arr));
    }
}
