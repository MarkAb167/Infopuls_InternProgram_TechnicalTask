package task_2;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {
    private Assert Assertions;

    @Test
    public void quickSort() {

        int[] expected = {-3, 0, 3, 4, 7, 7, 8, 10, 12};
        int[] actual = {8, 0, 4, 7, 3, 7, 10, 12, -3};

        int[] actualSortedArray = QuickSort.quickSort(actual);

        Assert.assertArrayEquals(expected, actualSortedArray);
    }
}
