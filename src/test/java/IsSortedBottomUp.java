import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsSortedBottomUp {

    private static final int[] SORTED_ARRAY_1 = {1, 2, 3, 4, 5, 6};
    private static final int[] SORTED_ARRAY_2 = {1, 2, 30, 40, 500, 6000};

    private static final int[] NOT_SORTED_ARRAY_1 = {546, 2, 3, 4, 5, 6};
    private static final int[] NOT_SORTED_ARRAY_2 = {1, 212, 3, 4, 5, 6};
    private static final int[] NOT_SORTED_ARRAY_3 = {1, 2, 3123, 4, 5, 6};
    private static final int[] NOT_SORTED_ARRAY_4 = {1, 2, 3, 45, 5, 6};
    private static final int[] NOT_SORTED_ARRAY_5 = {1, 2, 3, 4, 5453, 6};

    private static final int[] EMPTY_ARR = {};


    @Test
    public void isSortedTest() {
        assertTrue(Program.isSorted(SORTED_ARRAY_1));
        assertTrue(Program.isSorted(SORTED_ARRAY_2));

        assertFalse(Program.isSorted(NOT_SORTED_ARRAY_1));
        assertFalse(Program.isSorted(NOT_SORTED_ARRAY_2));
        assertFalse(Program.isSorted(NOT_SORTED_ARRAY_3));
        assertFalse(Program.isSorted(NOT_SORTED_ARRAY_4));
        assertFalse(Program.isSorted(NOT_SORTED_ARRAY_5));
    }

    @Test
    public void isSortedTest_empty() {
        Program.isSorted(EMPTY_ARR);
    }

    @Test
    public void isSortedTest_null() {
        int[] arr = null;
        Program.isSorted(arr);
    }
}
