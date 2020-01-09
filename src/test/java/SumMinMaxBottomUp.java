import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumMinMaxBottomUp {
    private static final int MIN1 = 1;
    private static final int MAX1 = 6;
    private static final int[] ARR1 = {MIN1, 2, 3, 4, 5, MAX1};

    private static final int MIN2 = -123;
    private static final int MAX2 = 21321321;
    private static final int[] ARR2 = {-1, MIN2, -2, MAX2, 0};

    private static final int MIN3 = -99999;
    private static final int MAX3 = 21321321;
    private static final int[] ARR3 = {-1, -123, -2, MAX3, MIN3};

    private static final int[] EMPTY_ARR = {};

    @Test (expected = NullPointerException.class)
    public void testSumMinMax_null() {
        int[] arr = null;
        Program.sumMinMax(arr);
    }

    @Test
    public void testSumMinMax() {
        int expectedResult = MIN1 + MAX1;
        assertEquals(expectedResult, Program.sumMinMax(ARR1));

        expectedResult = MIN2 + MAX2;
        assertEquals(expectedResult, Program.sumMinMax(ARR2));

        expectedResult = MIN3 + MAX3;
        assertEquals(expectedResult, Program.sumMinMax(ARR3));
    }

    @Test
    public void testSumMinMax_empty() {
        assertEquals(0, Program.sumMinMax(EMPTY_ARR));
    }
}
