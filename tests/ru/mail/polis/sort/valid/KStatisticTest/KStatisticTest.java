package KStatisticTest;

import KStatistic.KStatistic;
import TestHelper.TestHelper;
import org.junit.Test;

public class KStatisticTest {
    @Test
    public void testKStatistic() throws Exception{
        TestHelper testHelper = new TestHelper();
        KStatistic kStatistic = new KStatistic();
        int[] arr = testHelper.gen(100);
        testHelper.randomPermutation(arr);
        int k = 49;
        if (k < arr.length) {
            kStatistic.searchK(arr, k);
            assert (arr[k] == k);
        } else {
            assert (false);
        }
    }
}
