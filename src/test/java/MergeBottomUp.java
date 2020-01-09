import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeBottomUp {

    private static final int[] ARR1 = {1, 2, 3, 4, 5, 6};
    private static final int[] ARR2 = {-1, -123, -2, 21321321, 0};
    private static final int[] ARR3 = {-1, -123, -2, 21321321, -99999};
    private static final int[] ARR4 = {7, 8, 9, 10};
    private static final int[] EMPTY_ARR = {};

    private static final int[] EXPECTED_ARR1_ARR1 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
    private static final int[] EXPECTED_ARR1_ARR2 = {-123, -2, -1, -0, 1, 2, 3, 4, 5, 6, 21321321};
    private static final int[] EXPECTED_ARR1_ARR3 = {-99999, -123, -2, -1, 1, 2, 3, 4, 5, 6, 21321321};
    private static final int[] EXPECTED_ARR2_EMPTY = {-123, -2, -1, 0, 21321321};
    private static final int[] EXPECTED_ARR1_ARR4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    @Test
    public void mergeTest_null() {
        int[] arr1 = null;
        int[] arr2 = null;
        assertNull(Program.merge(arr1, arr2));
    }

    @Test
    public void mergeTest_oneNull() {
        int[] arrNull = null;
        int[] arrMerged = Program.merge(ARR1, arrNull);
        assertArrayEquals(arrMerged, ARR1);

        arrNull = null;
        arrMerged = Program.merge(arrNull, ARR2);
        assertArrayEquals(arrMerged, ARR2);
    }

    @Test
    public void mergeTest_diffSize() {
        int[] arrMerged = Program.merge(ARR1, ARR2);
        assertArrayEquals(EXPECTED_ARR1_ARR2, arrMerged);

        arrMerged = Program.merge(ARR1, ARR3);
        assertArrayEquals(EXPECTED_ARR1_ARR3, arrMerged);

        arrMerged = Program.merge(ARR2, EMPTY_ARR);
        assertArrayEquals(EXPECTED_ARR2_EMPTY, arrMerged);
    }

    @Test
    public void mergeTest_sameArray() {
        int[] arrMerged = Program.merge(ARR1, ARR1);
        assertArrayEquals(EXPECTED_ARR1_ARR1, arrMerged);

        arrMerged = Program.merge(EMPTY_ARR, EMPTY_ARR);
        assertArrayEquals(new int[]{}, arrMerged);
    }

    @Test
    public void mergeTest_sorted() {
        int[] arrMerged = Program.merge(ARR1, ARR4);
        assertArrayEquals(EXPECTED_ARR1_ARR4, arrMerged);
    }

}
