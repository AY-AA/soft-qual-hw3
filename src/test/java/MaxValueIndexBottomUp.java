import org.junit.Before;
import org.junit.Test;

import java.util.EnumMap;

import static org.junit.Assert.assertEquals;

public class MaxValueIndexBottomUp {

    private static final int[] ARR1 = {1, 2, 3, 4, 5, 6};
    private static final int[] ARR2 = {-1, -123, -2, 21321321, 0};
    private static final int[] ARR3 = {-1, -123, -2, 21321321, -99999};
    private static final int[] EMPTY_ARR = {};
    private Program program;

    @Before
    public void setUp(){
        program = new Program();
    }

    @Test
    public void maxValueIndexTest() {
        int minValueIndex = 5;
        assertEquals(minValueIndex, program.maxValueIndex(ARR1));

        minValueIndex = 3;
        assertEquals(minValueIndex, program.maxValueIndex(ARR2));

        minValueIndex = 3;
        assertEquals(minValueIndex, program.maxValueIndex(ARR3));
    }

    @Test
    public void maxValueIndexTest_null() {
        int[] nullArray = null;
        assertEquals(-1, program.maxValueIndex(nullArray));
    }

    @Test
    public void maxValueIndexTest_empty() {
        int expected = -1;
        assertEquals(expected, program.maxValueIndex(EMPTY_ARR));
    }
}
