//import org.junit.Test;
//
//import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertNull;
//
//public class CopyArrBottomUp {
//
//    private static final int[] ARR1 = {1, 2, 3, 4, 5, 6};
//    private static final int[] ARR2 = {-1, -123, -2, 21321321, 0};
//    private static final int[] ARR3 = {-1, -123, -2, 21321321, -99999};
//    private static final int[] EMPTY_ARR = {};
//
//    @Test
//    public void copyArrTest() {
//        int[] arr_coppied = Program.copyArr(ARR1);
//        assertArrayEquals(ARR1, arr_coppied);
//
//        arr_coppied = Program.copyArr(ARR2);
//        assertArrayEquals(ARR2, arr_coppied);
//
//        arr_coppied = Program.copyArr(ARR3);
//        assertArrayEquals(ARR3, arr_coppied);
//
//        arr_coppied = Program.copyArr(EMPTY_ARR);
//        assertArrayEquals(EMPTY_ARR, arr_coppied);
//    }
//
//    @Test
//    public void copyArrTest_null() {
//        int[] nullArray = null;
//        assertNull(Program.copyArr(nullArray));
//    }
//}
