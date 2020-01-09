import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinValueIndexBottomUp {

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
    public void minValueIndexTest() {
        int minValueIndex = 0;
        assertEquals(minValueIndex, program.minValueIndex(ARR1));

        minValueIndex = 1;
        assertEquals(minValueIndex, program.minValueIndex(ARR2));

        minValueIndex = 4;
        assertEquals(minValueIndex, program.minValueIndex(ARR3));
    }

    @Test
    public void minValueIndexTestNull() {
        int[] nullArray = null;
        assertEquals(-1, program.minValueIndex(nullArray));
    }

    @Test
    public void minValueTestIndex_empty() {
        int expected = -1;
        assertEquals(expected, program.minValueIndex(EMPTY_ARR));
    }

}
