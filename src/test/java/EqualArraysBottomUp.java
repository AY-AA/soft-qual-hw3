import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class EqualArraysBottomUp {

    private static final int[] ARR1 = {1, 2, 3, 4, 5, 6};
    private static final int[] ARR2 = {-1, -123, -2, 21321321, 0};
    private static final int[] ARR3 = {-1, -123, -2, 21321321, -99999};
    private static final int[] ARR4 = {1, -2, 3, 4, 5, 6};
    private static final int[] ARR5 = {1, 2, 3, 4, 5, 0};
    private static final int[] ARR6 = {-1, 2, 3, 4, 5, -6};
    private static final int[] EMPTY_ARR = {};

    private static final int[] ARR1_COPIED = {1, 2, 3, 4, 5, 6};
    private static final int[] ARR2_COPIED = {-1, -123, -2, 21321321, 0};
    private static final int[] ARR3_COPIED = {-1, -123, -2, 21321321, -99999};
    private Program program;

    @Before
    public void setUp(){
        program = new Program();
    }

    @Test
    public void equalArraysTest_null() {
        int[] arr1 = null;
        int[] arr2 = null;
        assertTrue(program.equalArrays(arr1, arr2));
    }

    @Test
    public void equalArraysTest_oneNull() {
        int[] arr1_null = null;
        int[] arr2_null = null;
        assertFalse(program.equalArrays(arr1_null, ARR2));
        assertFalse(program.equalArrays(ARR1, arr2_null));
    }

    @Test
    public void equalArraysTest_diffSize() {
        assertFalse(program.equalArrays(ARR1, ARR2));
        assertFalse(program.equalArrays(ARR1, ARR3));
        assertFalse(program.equalArrays(ARR2, EMPTY_ARR));
    }

    @Test
    public void equalArraysTest() {
        assertTrue(program.equalArrays(ARR1, ARR1_COPIED));
        assertTrue(program.equalArrays(ARR2, ARR2_COPIED));
        assertTrue(program.equalArrays(ARR3, ARR3_COPIED));
        assertFalse(program.equalArrays(ARR1, ARR4));
        assertFalse(program.equalArrays(ARR1, ARR5));
        assertFalse(program.equalArrays(ARR1, ARR6));
        assertTrue(program.equalArrays(EMPTY_ARR, new int[0]));
    }

}
