import org.junit.*;

public class SumMinMaxTopDown {

    private static final int MIN = 1;
    private static final int MAX = 10;
    private static final int[] ARR1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final int[] ARR2 = new int[]{1, 2, 9, 4, 50, 6, 7, 8, 12, 10};
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
        Assert.assertEquals(62, testRes2);
    }


    class MinMaxStub extends Program {

        public int minValue(int[] arr) {
            return MIN;
        }

        public int maxValue(int[] arr) {
            return MAX;
        }
    }
}

