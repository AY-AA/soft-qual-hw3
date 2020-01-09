import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeTopDown {
    Program testProgram;
    private static final int[] ARR1 = {1, 2, 3, 4, 5, 6};
    private static final int[] ARR2 = {-1, -123, -2, 21321321, 0};
    private static final int[] ARR3 = {-1, -123, -2, 21321321, -99999};
    private static final int[] ARR4 = {7, 8, 9, 10};
    private static final int[] EMPTY_ARR = {};

    @Before
    public void beforeTests() {
        testProgram = new SortArrayStub();
    }

    @Test
    public void mergeTest_null() {
        int[] arr1 = null;
        int[] arr2 = null;
        assertNull(testProgram.merge(arr1, arr2));
    }

    @Test
    public void mergeTest_oneNull() {
        int[] arrNull = null;
        int length = ARR1.length;
        int[] arrMerged = testProgram.merge(ARR1, arrNull);
        verifySorted(arrMerged, length);

        arrNull = null;
        length = ARR2.length;
        arrMerged = testProgram.merge(arrNull, ARR2);
        verifySorted(arrMerged, length);
    }

    @Test
    public void mergeTest_diffSize() {
        int length = ARR1.length + ARR2.length;
        int[] arrMerged = testProgram.merge(ARR1, ARR2);
        verifySorted(arrMerged, length);

        length = ARR1.length + ARR3.length;
        arrMerged = testProgram.merge(ARR1, ARR3);
        verifySorted(arrMerged, length);

        length = ARR2.length + EMPTY_ARR.length;
        arrMerged = testProgram.merge(ARR2, EMPTY_ARR);
        verifySorted(arrMerged, length);
    }

    @Test
    public void mergeTest_sameArray() {
        int length = ARR1.length * 2;
        int[] arrMerged = testProgram.merge(ARR1, ARR1);
        verifySorted(arrMerged, length);

        length = ARR2.length * 2;
        arrMerged = testProgram.merge(ARR2, ARR2);
        verifySorted(arrMerged, length);

        length = ARR3.length * 2;
        arrMerged = testProgram.merge(ARR3, ARR3);
        verifySorted(arrMerged, length);

        length = EMPTY_ARR.length * 2;
        arrMerged = testProgram.merge(EMPTY_ARR, EMPTY_ARR);
        verifySorted(arrMerged, length);
    }

    @Test
    public void mergeTest_sorted() {
        int length = ARR1.length + ARR4.length;
        int[] arrMerged = testProgram.merge(ARR1, ARR4);
        verifySorted(arrMerged, length);
    }

    private void verifySorted(int[] arrSorted, int length) {
        assertEquals(length, arrSorted.length);
        for (int i = 0; i < length -1 ; i++)
            Assert.assertTrue(arrSorted[i] <= arrSorted[i+1]);

    }


    class SortArrayStub extends Program {
        @Override
        public int[] sortArray(int[] arr) {
            int[] arr1 = new int[arr.length];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            Arrays.sort(arr1);
            return arr1;
        }

    }
}
