import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxValueBottomUp {

    private static final int[] ARR1 = {1, 2, 3, 4, 5, 6};
    private static final int[] ARR2 = {-1, -123, -2, 21321321, 0};
    private static final int[] ARR3 = {-1, -123, -2, 21321321, -99999};
    private static final int[] EMPTY_ARR = {};

    @Test(expected = NullPointerException.class)
    public void maxValueTest_null() {
        int[] arr1 = null;
        Program.maxValue(arr1);
    }

    @Test
    public void maxValueTest() {
        int maxVal = 6;
        assertEquals(maxVal, Program.maxValue(ARR1));

        maxVal = 21321321;
        assertEquals(maxVal, Program.maxValue(ARR2));

        maxVal = 21321321;
        assertEquals(maxVal, Program.maxValue(ARR3));
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void maxValueTest_empty() {
        Program.maxValue(EMPTY_ARR);
    }

}
