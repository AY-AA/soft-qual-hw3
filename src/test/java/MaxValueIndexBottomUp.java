import org.junit.Test;

import java.util.EnumMap;

import static org.junit.Assert.assertEquals;

public class MaxValueIndexBottomUp {

    private static final int[] ARR1 = {1, 2, 3, 4, 5, 6};
    private static final int[] ARR2 = {-1, -123, -2, 21321321, 0};
    private static final int[] ARR3 = {-1, -123, -2, 21321321, -99999};
    private static final int[] EMPTY_ARR = {};


    @Test
    public void maxValueIndexTest() {
        int minValueIndex = 5;
        assertEquals(minValueIndex, Program.maxValueIndex(ARR1));

        minValueIndex = 3;
        assertEquals(minValueIndex, Program.maxValueIndex(ARR2));

        minValueIndex = 3;
        assertEquals(minValueIndex, Program.maxValueIndex(ARR3));
    }

    @Test (expected = NullPointerException.class)
    public void maxValueIndexTest_null() {
        int[] nullArray = null;
        Program.maxValueIndex(nullArray);

    }

    @Test
    public void maxValueIndexTest_empty() {
        int expected = -1;
        assertEquals(expected, Program.maxValueIndex(EMPTY_ARR));
    }
}
