package KStatisticLinear;

import TestHelper.TestHelper;
import org.junit.Test;


public class KStatisticLinearTest {
    @Test
    public void testKStatistic() throws Exception{
        TestHelper testHelper = new TestHelper();
        KStatisticLinear kStatisticLinear = new KStatisticLinear();
        int[] arr = testHelper.gen(100);
        testHelper.randomPermutation(arr);
        int k = 49;
        if (k < arr.length) {
            kStatisticLinear.searchKLinear(arr, k);
            assert (arr[k] == k);
        } else {
            assert (false);
        }
    }
}
