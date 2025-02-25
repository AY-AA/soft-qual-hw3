import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

//TODO: Check in Windows!
public class PrintSortedTopDown {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Program testProgram;

    private static final int[] ARR = {-1, -123, -2, 21321321, 0};
    private static final String EXPECTED_EMPTY_ARR = "\n\n\n";
    private static final String EXPECTED_NULL = "No array\r\n";
    private static final String EXPECTED_ARR = "-1 -123 -2 21321321 0 \r\n" +
            "-123 -2 -1 0 21321321 \r\n" +
            "-123 -2 -1 0 21321321 \r\n";

    @Before
    public void setUp() {
        testProgram = new Program();
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

}

