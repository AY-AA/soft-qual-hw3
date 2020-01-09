import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsSortedEqualArrSortArrayStubsTopDown {

    //private static final int[] NULL_ARR = null;
    Program testProgram;
    private static final int[] SORTED_ARRAY_1 = {1, 2, 3, 4, 5, 6};
    private static final int[] SORTED_ARRAY_2 = {1, 2, 30, 40, 500, 6000};

    private static final int[] NOT_SORTED_ARRAY_1 = {546, 2, 3, 4, 5, 6};
    private static final int[] NOT_SORTED_ARRAY_2 = {1, 212, 3, 4, 5, 6};
    private static final int[] NOT_SORTED_ARRAY_3 = {1, 2, 3123, 4, 5, 6};
    private static final int[] NOT_SORTED_ARRAY_4 = {1, 2, 3, 45, 5, 6};
    private static final int[] NOT_SORTED_ARRAY_5 = {1, 2, 3, 4, 5453, 6};

    @Before
    public void beforeTests() {
        testProgram = new SortArrayEqualArraysStub();
    }

    @Test
    public void testSortedArray() {
        assertTrue(testProgram.isSorted(SORTED_ARRAY_1));
        assertTrue(testProgram.isSorted(SORTED_ARRAY_2));

        assertFalse(testProgram.isSorted(NOT_SORTED_ARRAY_1));
        assertFalse(testProgram.isSorted(NOT_SORTED_ARRAY_2));
        assertFalse(testProgram.isSorted(NOT_SORTED_ARRAY_3));
        assertFalse(testProgram.isSorted(NOT_SORTED_ARRAY_4));
        assertFalse(testProgram.isSorted(NOT_SORTED_ARRAY_5));
    }


    class SortArrayEqualArraysStub extends Program {
        @Override
        public int[] sortArray(int[] arr) {
            int[] arr1 = new int[arr.length];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            Arrays.sort(arr1);
            return arr1;
        }

        @Override
        public boolean equalArrays(int[] arr1, int[] arr2) {
            return Arrays.equals(arr1, arr2);
        }
    }
}
