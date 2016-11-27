package QuickSortRandomTest;

import QuickSortRandomPivot.QuickSortRandom;
import TestHelper.TestHelper;
import org.junit.Test;

public class QuickSortRandomTest {
    @Test
    public void testQuickSortRandom() throws Exception{
        TestHelper testHelper = new TestHelper();
        QuickSortRandom quickSortRandom = new QuickSortRandom();
        int n = 1000;
        int[] arr = testHelper.gen(n);
        testHelper.randomPermutation(arr);
        quickSortRandom.quickSortRandom(arr);
        assert(testHelper.isSorted(arr));
    }
}
