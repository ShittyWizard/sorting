package MergeSortConstTest;

import MergeSortConst.MergeSortConst;
import TestHelper.TestHelper;
import org.junit.Test;

public class MergeSortConstTest {
    @Test
    public void testMergeSortConst() throws Exception{
        TestHelper testHelper = new TestHelper();
        MergeSortConst mergeSortConst = new MergeSortConst();
        int n = 1000;
        int[] arr = testHelper.gen(n);
        testHelper.randomPermutation(arr);
        arr = mergeSortConst.mergeSortConst(arr);
        assert(testHelper.isSorted(arr));
    }
}
