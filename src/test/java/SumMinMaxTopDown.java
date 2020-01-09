import org.junit.*;

public class SumMinMaxTopDown {

    private static final int MIN1 = 1;
    private static final int MAX1 = 10;
    private static final int MIN2 = 1;
    private static final int MAX2 = 50;
    private static final int[] ARR1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final int[] ARR2 = {1, 2, 9, 4, 50, 6, 7, 8, 12, 10};
    //private static final int[] NULL_ARR = null;
    Program testProgram;

    @Before
    public void beforeTests() {
        testProgram = new MinMaxStub();
    }

    @Test
    public void testSumMinMax() {
        int testRes1 = testProgram.sumMinMax(ARR1);
        int testRes2 = testProgram.sumMinMax(ARR2);
        Assert.assertEquals(11, testRes1);
        Assert.assertEquals(51, testRes2);
    }


    class MinMaxStub extends Program {

        public int minValue(int[] arr) {
            if (arr == ARR1)
                return MIN1;
            return MIN2;
        }

        public int maxValue(int[] arr) {
            if (arr == ARR1)
                return MAX1;
            return MAX2;
        }
    }
}

