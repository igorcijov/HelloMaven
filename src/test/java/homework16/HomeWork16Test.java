package homework16;
/**
 * Java Pro. Homework #12
 * @author Igor Cijov
 * @version 16 Aug 2022
 */

import homework16.HomeWork16;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class HomeWork16Test {
    Exception indexOut = new IndexOutOfBoundsException();

    int[]array1 = {1,2,3,5,4,6,7,4,5,10};
    Integer[] array1Result = {5,10};
    int[]array2 = {1,2,3,5,4,6,7,5,10};
    Integer[] array2Result = {6,7,5,10};
    int[]array3 = {1,2,3,5,4,6,7,4,4,10};
    Integer[] array3Result = {10};
    int[]array4 = {1,2,3,5,6,7,5,10};
   // Integer[]arrayEx4 = runTimeException;
    int value = 4;

    @Test
    public void testPullOut () {
        Assertions.assertArrayEquals(array1Result, HomeWork16.arrayPullOut(array1, value));
        Assertions.assertArrayEquals(array2Result, HomeWork16.arrayPullOut(array2, value));
        Assertions.assertArrayEquals(array3Result, HomeWork16.arrayPullOut(array3, value));
    }
    @Test
    public void testError () {
        Assertions.assertEquals(indexOut, HomeWork16.arrayPullOut(array4,value));
    }

}
