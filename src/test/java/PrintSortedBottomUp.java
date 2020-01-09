import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PrintSortedBottomUp {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private static final int[] ARR1 = {1, 2, 3, 4, 5, 6};
    private static final int[] ARR2 = {-1, -123, -2, 21321321, 0};
    private static final String EXPECTED_NULL = "No array\r\n";
    private static final String EXPECTED_EMPTY_ARR = "\r\n";
    private static final String EXPECTED_ARR1 = "1 2 3 4 5 6 \n" +
                                                "1 2 3 4 5 6 \n" +
                                                "1 2 3 4 5 6  \r\n";
    private static final String EXPECTED_ARR2 = "-1 -123 -2 21321321 0 \n" +
                                                "-123 -2 -1 0 21321321 \n" +
                                                "-123 -2 -1 0 21321321 \r\n";

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test (expected = NullPointerException.class)
    public void printSortedTest_null() { //TODO: test in Windows
        int[] arr = null;
        Program.printSorted(arr);
        assertEquals(EXPECTED_NULL, outContent.toString());
    }

    @Test
    public void printSortedTest_empty() { //TODO: test in Windows
        int[] arr = {};
        Program.printSorted(arr);
        assertEquals(EXPECTED_EMPTY_ARR, outContent.toString());
    }

    @Test
    public void printSortedTest1() { //TODO: test in Windows
        Program.printSorted(ARR1);
        assertEquals(EXPECTED_ARR1, outContent.toString());
    }

    @Test
    public void printSortedTest2() { //TODO: test in Windows
        Program.printSorted(ARR2);
        assertEquals(EXPECTED_ARR2, outContent.toString());
    }

}
