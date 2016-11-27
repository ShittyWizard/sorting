package ShellSortTest;

import ShellSort.ShellSort;
import TestHelper.TestHelper;
import org.junit.Test;


public class shellSortTest {
    @Test
    public void testShellSort() throws Exception{
        TestHelper testHelper = new TestHelper();
        ShellSort ShellSort = new ShellSort();
        int n = 1000;
        int[] arr = testHelper.gen(n);
        testHelper.randomPermutation(arr);
        arr = ShellSort.shellSort(arr);
        assert(testHelper.isSorted(arr));
    }
}
