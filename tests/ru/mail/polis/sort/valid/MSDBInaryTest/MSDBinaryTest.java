package MSDBInaryTest;

import MSDBinary.MSDBinary;
import TestHelper.TestHelper;
import org.junit.Test;

public class MSDBinaryTest {
    @Test
    public void testMergeSortConst() throws Exception{
        TestHelper testHelper = new TestHelper();
        MSDBinary msdBinary = new MSDBinary();
        int n = 1000;
        int[] arr = testHelper.gen(n);
        testHelper.randomPermutation(arr);
        arr = msdBinary.sort(arr);
        assert(testHelper.isSorted(arr));
    }
}
