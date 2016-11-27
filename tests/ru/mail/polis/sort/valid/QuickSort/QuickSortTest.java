package QuickSort;

import QuickSortFixedPivot.QuickSort;
import TestHelper.TestHelper;
import org.junit.Test;

public class QuickSortTest {
    @Test
    public void testQucikSort() throws Exception{
        TestHelper testHelper = new TestHelper();
        QuickSort quickSort = new QuickSort();
        int n = 1000;
        int[] arr = testHelper.gen(n);
        testHelper.randomPermutation(arr);
        arr = quickSort.quickSort(arr);
        assert(testHelper.isSorted(arr));
    }
}
