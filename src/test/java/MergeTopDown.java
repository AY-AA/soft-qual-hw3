import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
        testProgram = new Program();
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
        verifySorted(arrMerged, length, ARR1, null);

        arrNull = null;
        length = ARR2.length;
        arrMerged = testProgram.merge(arrNull, ARR2);
        verifySorted(arrMerged, length, null, ARR2);
    }

    @Test
    public void mergeTest_diffSize() {
        int length = ARR1.length + ARR2.length;
        int[] arrMerged = testProgram.merge(ARR1, ARR2);
        verifySorted(arrMerged, length, ARR1, ARR2);

        length = ARR1.length + ARR3.length;
        arrMerged = testProgram.merge(ARR1, ARR3);
        verifySorted(arrMerged, length, ARR1, ARR3);

        length = ARR2.length + EMPTY_ARR.length;
        arrMerged = testProgram.merge(ARR2, EMPTY_ARR);
        verifySorted(arrMerged, length, ARR2, EMPTY_ARR);
    }

    @Test
    public void mergeTest_sameArray() {
        int length = ARR1.length * 2;
        int[] arrMerged = testProgram.merge(ARR1, ARR1);
        verifySorted(arrMerged, length, ARR1, ARR1);

        length = ARR2.length * 2;
        arrMerged = testProgram.merge(ARR2, ARR2);
        verifySorted(arrMerged, length, ARR2, ARR2);

        length = ARR3.length * 2;
        arrMerged = testProgram.merge(ARR3, ARR3);
        verifySorted(arrMerged, length, ARR3, ARR3);

        length = EMPTY_ARR.length * 2;
        arrMerged = testProgram.merge(EMPTY_ARR, EMPTY_ARR);
        verifySorted(arrMerged, length, EMPTY_ARR, EMPTY_ARR);
    }

    @Test
    public void mergeTest_sorted() {
        int length = ARR1.length + ARR4.length;
        int[] arrMerged = testProgram.merge(ARR1, ARR4);
        verifySorted(arrMerged, length, ARR1, ARR4);
    }

    private void verifySorted(int[] arrSorted, int length, int[] arr1, int[] arr2) {
        assertEquals(length, arrSorted.length);
        for (int i = 0; i < length - 1; i++)
            Assert.assertTrue(arrSorted[i] <= arrSorted[i + 1]);

        if (arr1 == null || arr1.length == 0) {
            assertEquals(length, arr2.length);
            for (int i = 0; i < length; i++) {
                assertTrue(contains(arr2[i], arrSorted));
            }
        }
        else if (arr2 == null || arr2.length == 0) {
            assertEquals(length, arr1.length);
            for (int i = 0; i < length; i++) {
                assertTrue(contains(arr1[i], arrSorted));
            }
        }
        else {
            assertEquals(length, arr1.length + arr2.length);
            for (int i = 0; i < arr1.length; i++) {
                assertTrue(contains(arr1[i], arrSorted));
            }
            for (int i = 0; i < arr2.length; i++) {
                assertTrue(contains(arr2[i], arrSorted));
            }
        }
    }

    private boolean contains(int value, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                arr[i] = Integer.MIN_VALUE;
                return true;
            }
        }
        return false;
    }

}
