//import org.junit.Assert;
//import org.junit.Test;
//
//public class SizeBottomUp {
//
//    @Test
//    public void arraySizeTest() {
//        int size = 5;
//        int[] arrayToTest = new int[size];
//        Assert.assertEquals(size, Program.size(arrayToTest));
//
//        size = 0;
//        arrayToTest = new int[size];
//        Assert.assertEquals(size, Program.size(arrayToTest));
//
//        size = 100;
//        arrayToTest = new int[size - 1];
//        Assert.assertNotEquals(size, Program.size(arrayToTest));
//
//        size = 5;
//        arrayToTest = new int[]{1, 2, 3, 4, 5};
//        Assert.assertEquals(size, Program.size(arrayToTest));
//    }
//
//    @Test (expected = NullPointerException.class)
//    public void nullArraySizeTest() {
//        int[] arrayToTest = null;
//        Program.size(arrayToTest);
//    }
//
//}
