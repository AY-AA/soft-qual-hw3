import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;


public class SumMinMaxMinValueMaxValueTopDown {

    private static final int MAX_VAL_IDX1 = 9;
    private static final int MAX_VAL_IDX2 = 4;
    private static final int[] ARR1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final int[] ARR2 = new int[]{1, 2, 9, 4, 50, 6, 7, 8, 12, 10};
    //private static final int[] NULL_ARR = null;
    Program testProgram;

    @Before
    public void beforeTests() {
        testProgram = new MaxValueIdxStub();
    }

    @Test
    public void testSumMinMax() {
        int testRes1 = testProgram.sumMinMax(ARR1);
        int testRes2 = testProgram.sumMinMax(ARR2);
        Assert.assertEquals(11, testRes1);
        Assert.assertEquals(62, testRes2);
    }

    class MaxValueIdxStub extends Program {

        public int maxValueIndex(int[] arr) {
            if (arr == ARR1)
                return MAX_VAL_IDX1;
            return MAX_VAL_IDX2;
        }
    }

}
