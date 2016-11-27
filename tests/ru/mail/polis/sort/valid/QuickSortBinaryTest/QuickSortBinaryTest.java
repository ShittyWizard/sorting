package QuickSortBinaryTest;

import QuickSortBinary.QuickSortBinary;
import TestHelper.TestHelper;
import org.junit.Test;


public class QuickSortBinaryTest {
    @Test
    public void testQuickSortBinary() throws Exception{
        TestHelper testHelper = new TestHelper();
        QuickSortBinary quickSortBinary = new QuickSortBinary();
        int n = 1000;
        int[] arr = testHelper.gen(n);
        testHelper.randomPermutation(arr);
        arr = quickSortBinary.sort(arr);
        assert(testHelper.isSorted(arr));
    }
}
