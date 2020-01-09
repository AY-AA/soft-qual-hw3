import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class SwapMinMaxBottomUp {
    private static final int MIN1 = 1;
    private static final int MAX1 = 6;
    private static final int[] ARR1 = {MIN1, 2, 3, 4, 5, MAX1};
    private static final int[] EXPECTED_ARR1 = {MAX1, 2, 3, 4, 5, MIN1};

    private static final int MIN2 = -123;
    private static final int MAX2 = 21321321;
    private static final int[] ARR2 = {-1, MIN2, -2, MAX2, 0};
    private static final int[] EXPECTED_ARR2 = {-1, MAX2, -2, MIN2, 0};

    private static final int MIN3 = -99999;
    private static final int MAX3 = 21321321;
    private static final int[] ARR3 = {-1, -123, -2, MAX3, MIN3};
    private static final int[] EXPECTED_ARR3 = {-1, -123, -2, MIN3, MAX3};


    private static final int[] EMPTY_ARR = {};
    private static final int[] EXPECTED_EMPTY_ARR = {};


    @Test
    public void swapMinMaxTest() {
        int[] swappedArr = Program.swapMinMax(ARR1);
        assertArrayEquals(EXPECTED_ARR1, swappedArr);

        swappedArr = Program.swapMinMax(ARR2);
        assertArrayEquals(EXPECTED_ARR2, swappedArr);

        swappedArr = Program.swapMinMax(ARR3);
        assertArrayEquals(EXPECTED_ARR3, swappedArr);
    }

    @Test (expected = NullPointerException.class)
    public void swapMinMaxTest_null() {
        int[] swappedArr = null;
        assertNull(Program.swapMinMax(swappedArr));
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void swapMinMaxTest_empty() {
        int[] swappedArr = Program.swapMinMax(EMPTY_ARR);
        assertArrayEquals(EXPECTED_EMPTY_ARR, swappedArr);
    }
}
