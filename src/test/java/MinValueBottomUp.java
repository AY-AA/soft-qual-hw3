import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MinValueBottomUp {
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
    public void minValueTest_null() {
        int[] arr1 = null;
        assertEquals(-1, program.minValue(arr1));
    }

    @Test
    public void minValueTest() {
        int minVal = 1;
        assertEquals(minVal, program.minValue(ARR1));

        minVal = -123;
        assertEquals(minVal, program.minValue(ARR2));

        minVal = -99999;
        assertEquals(minVal, program.minValue(ARR3));
    }

    @Test
    public void minValueTest_empty() {
        assertEquals(-1, program.minValue(EMPTY_ARR));
    }

}
