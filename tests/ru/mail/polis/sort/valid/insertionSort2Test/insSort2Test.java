package insertionSort2Test;

import TestHelper.TestHelper;
import insertionSort2.insertionSort2;
import org.junit.Test;

public class insSort2Test {
    @Test
    public void testInsertSort() throws Exception{
        TestHelper testHelper = new TestHelper();
        insertionSort2 insSort = new insertionSort2();
        int n = 1000;
        int[] arr = testHelper.gen(n);
        testHelper.randomPermutation(arr);
        arr = insSort.insertSort2(arr);
        assert(testHelper.isSorted(arr));
    }
}
