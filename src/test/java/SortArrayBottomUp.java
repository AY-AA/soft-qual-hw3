import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class SortArrayBottomUp {

    private static final int[] ARR1 = {1, 2, 3, 4, 5, 6};
    private static final int[] ARR2 = {-1, -123, -2, 21321321, 0};
    private static final int[] ARR3 = {-1, -123, -2, 21321321, -99999};
    private static final int[] EMPTY_ARR = {};

    @Test
    public void sortArrayTest_null() {
        int[] arr1 = null;
        assertNull(Program.sortArray(arr1));
    }

    @Test
    public void sortArrayTest() {
        int arrLength = ARR1.length;
        int[] arrSorted = Program.sortArray(ARR1);
        verifySorted(arrSorted, arrLength);

        arrLength = ARR2.length;
        arrSorted = Program.sortArray(ARR2);
        verifySorted(arrSorted, arrLength);

        arrLength = ARR3.length;
        arrSorted = Program.sortArray(ARR3);
        verifySorted(arrSorted, arrLength);

        arrLength = EMPTY_ARR.length;
        arrSorted = Program.sortArray(EMPTY_ARR);
        verifySorted(arrSorted, arrLength);
    }

    private void verifySorted(int[] arrSorted, int length) {
        assertEquals(length, arrSorted.length);
        for (int i = 0; i < length -1 ; i++)
            assertTrue(arrSorted[i] <= arrSorted[i+1]);

    }

}
