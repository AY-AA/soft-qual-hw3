import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SwapMinMaxCopyArrStubTopDown {
    private static final int MIN_VALUE_IDX = 4;
    private static final int MAX_VALUE_IDX = 3;
    private static final int MIN_VALUE_IDX_NEG = 4;
    private static final int MAX_VALUE_IDX_NEG = 3;
    private static final int MAX = 455;
    private static final int MIN = 1;
    private static final int MAX_WITH_NEG = 455;
    private static final int MIN_WITH_NEG = -45;
    private static final int[] ARR1 = {67, 32, 34, MAX, MIN, 61, 72, 8, 93, 120};
    private static final int[] ARR1_COPY = {67, 32, 34, 455, 1, 61, 72, 8, 93, 120};
    private static final int[] ARR_WITH_NEG_VALS = {13, 32, -12, MAX_WITH_NEG, 1, 61, 72, 8, MIN_WITH_NEG, -23};
    private static final int[] ARR_WITH_NEG_VALS_COPY = {13, 32, -12, MAX_WITH_NEG, 1, 61, 72, 8, MIN_WITH_NEG, -23};
    public boolean negNumFlag = false;
    Program testProgram;

    @Before
    public void beforeTests() {
        testProgram = new CopyArrStub();
    }

    @Test
    public void testSwapMinMax() {
        negNumFlag = false;
        int[] testRes = testProgram.swapMinMax(ARR1);
        Assert.assertEquals(MIN, testRes[MAX_VALUE_IDX]);
        Assert.assertEquals(MAX, testRes[MIN_VALUE_IDX]);
    }

    @Test
    public void testSwapMinMaxWithNeg() {
        negNumFlag = true;
        int[] testRes = testProgram.swapMinMax(ARR_WITH_NEG_VALS);
        Assert.assertEquals(MIN_WITH_NEG, testRes[MAX_VALUE_IDX_NEG]);
        Assert.assertEquals(MAX_WITH_NEG, testRes[MIN_VALUE_IDX_NEG]);
    }

    class CopyArrStub extends Program {
        public int[] copyArr(int[] arr) {
            if(negNumFlag)
                return ARR_WITH_NEG_VALS_COPY;
            return ARR1_COPY;
        }
    }
}
