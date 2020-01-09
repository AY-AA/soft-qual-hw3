import org.junit.*;

public class SumMinMaxMaxValueMaxValueIndexStubsTopDown {

    private static final int MAX_VAL_IDX1 = 9;
    private static final int MAX_VAL_IDX2 = 4;
    private static final int MAX1 = 10;
    private static final int MAX2 = 50;
    private static final int[] ARR1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final int[] ARR2 = new int[]{1, 2, 9, 4, 50, 6, 7, 8, 12, 10};
    //private static final int[] NULL_ARR = null;
    Program testProgram;

    @Before
    public void beforeTests() {
        testProgram = new MaxValueIdxMaxValueStub();
    }

    @Test
    public void testSumMinMax() {
        int testRes1 = testProgram.sumMinMax(ARR1);
        int testRes2 = testProgram.sumMinMax(ARR2);
        Assert.assertEquals(11, testRes1);
        Assert.assertEquals(51, testRes2);
    }


    class MaxValueIdxMaxValueStub extends Program {

        public int maxValue(int[] arr) {
            if (arr == ARR1)
                return MAX1;
            return MAX2;
        }

        public int maxValueIndex(int[] arr) {
            if (arr == ARR1)
                return MAX_VAL_IDX1;
            return MAX_VAL_IDX2;
        }
    }
}

