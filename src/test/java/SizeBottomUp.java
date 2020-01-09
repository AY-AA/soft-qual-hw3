import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SizeBottomUp {
    private Program program;

    @Before
    public void setUp(){
        program = new Program();
    }
    @Test
    public void arraySizeTest() {
        int size = 5;
        int[] arrayToTest = new int[size];
        Assert.assertEquals(size, program.size(arrayToTest));

        size = 0;
        arrayToTest = new int[size];
        Assert.assertEquals(size, program.size(arrayToTest));

        size = 100;
        arrayToTest = new int[size - 1];
        Assert.assertNotEquals(size, program.size(arrayToTest));

        size = 5;
        arrayToTest = new int[]{1, 2, 3, 4, 5};
        Assert.assertEquals(size, program.size(arrayToTest));
    }

    @Test
    public void nullArraySizeTest() {
        int[] arrayToTest = null;
        int expected = -1;
        int size = program.size(arrayToTest);
        Assert.assertEquals(expected, size);
    }

}
