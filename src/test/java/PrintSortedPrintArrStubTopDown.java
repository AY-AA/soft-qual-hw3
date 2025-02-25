import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;



//TODO: Check in Windows!
public class PrintSortedPrintArrStubTopDown {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Program testProgram;

    private static final int[] ARR = {-1, -123, -2, 21321321, 0};
    private static final String EXPECTED_EMPTY_ARR = "\n\n\n";
    private static final String EXPECTED_NULL = "No array\r\n";
    private static final String EXPECTED_ARR = "-1 -123 -2 21321321 0 \r\n" +
            "-123 -2 -1 0 21321321 \r\n" +
            "-123 -2 -1 0 21321321 \r\n";
    private static final String EXPECTED_ARR_R1 = "-1 -123 -2 21321321 0 \r";
    private static final String EXPECTED_ARR_R2 = "-123 -2 -1 0 21321321 \r";
    private static final String EXPECTED_ARR_R3 = "-123 -2 -1 0 21321321 \r";


    int round = 1;

    @Before
    public void setUp() {
        testProgram = new PrintArrStub();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testPrintSortedNull() {
        int[] nullArr = null;
        testProgram.printSorted(nullArr);
        assertEquals(EXPECTED_NULL, outContent.toString());
    }

    @Test
    public void testPrintSortedEmpty() {
        int[] emptyArr = {};
        testProgram.printSorted(emptyArr);
        assertEquals(EXPECTED_EMPTY_ARR, outContent.toString());
    }

    @Test
    public void testPrintSorted() {
        testProgram.printSorted(ARR);
        assertEquals(EXPECTED_ARR, outContent.toString());
    }

    class PrintArrStub extends Program {

        public void printArr(int[] arr) {
            if(arr == null)
                System.out.println(EXPECTED_NULL);
            else if(arr.length == 0)
                System.out.println(EXPECTED_EMPTY_ARR);
            else {
                switch (round) {
                    case 1:
                        System.out.println(EXPECTED_ARR_R1);
                        round++;
                        break;
                    case 2:
                        round++;
                        System.out.println(EXPECTED_ARR_R2);
                        break;
                    case 3:
                        round++;
                        System.out.println(EXPECTED_ARR_R3);
                        break;
                    default: System.out.println("NO WAY");
                }
            }

        }
    }

}
