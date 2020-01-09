import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayBottomUp {

    private static final int[] ARR1 = {1, 2, 3, 4, 5, 6};
    private static final int[] ARR2 = {-1, -123, -2, 21321321, 0};
    private static final int[] ARR3 = {-1, -123, -2, 21321321, -99999};

    private static final int[] SORTED_ARR1 = {1, 2, 3, 4, 5, 6};
    private static final int[] SORTED_ARR2 = {-123 -2, -1, 0, 21321321};
    private static final int[] SORTED_ARR3 = {-99999, -123 -2, -1, 0, 21321321};

    private static final int[] EMPTY_ARR = {};

    @Test
    public void sortArrayTest_null() {
        int[] arr1 = null;
        assertNull(Program.sortArray(arr1));
    }

    @Test
    public void sortArrayTest() {
        int[] arrSorted = Program.sortArray(ARR1);
        assertArrayEquals(arrSorted, SORTED_ARR1);

        arrSorted = Program.sortArray(ARR2);
        assertArrayEquals(arrSorted, SORTED_ARR2);

        arrSorted = Program.sortArray(ARR3);
        assertArrayEquals(arrSorted, SORTED_ARR3);

        arrSorted = Program.sortArray(EMPTY_ARR);
        assertArrayEquals(arrSorted, EMPTY_ARR);
    }

}
