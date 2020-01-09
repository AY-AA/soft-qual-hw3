import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PrintArrBottomUp {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private static final int[] ARR1 = {1, 2, 3, 4, 5, 6};
    private static final int[] ARR2 = {-1, -123, -2, 21321321, 0};
    private static final int[] EMPTY_ARR = {};

    private static final String EXPECTED_ARR1 = "1 2 3 4 5 6 \r\n";
    private static final String EXPECTED_ARR2 = "-1 -123 -2 21321321 0 \r\n";
    private static final String EXPECTED_EMPTY_ARR = "\r\n";
    private Program program;

    @Before
    public void setUp(){
        program = new Program();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printArrTest1() {
        program.printArr(ARR1);
        assertEquals(EXPECTED_ARR1, outContent.toString());
    }

    @Test
    public void printArrTest2() {
        program.printArr(ARR2);
        assertEquals(EXPECTED_ARR2, outContent.toString());
    }

    @Test
    public void printArr_empty() {
        program.printArr(EMPTY_ARR);
        assertEquals(EXPECTED_EMPTY_ARR, outContent.toString());
    }

    @Test
    public void printArrNullTest() {
        program.printArr(null);
    }

}