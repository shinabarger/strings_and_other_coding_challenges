package bounds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/6/17.
 */

public class PrintMultiplesUnitTests {

    @Test
    public void startingNumberReturns1() {
        int expected = 1;
        int actual = PrintMultiples.returnStartingNumber(1);
        assertEquals(expected, actual);
    }

    @Test
    public void startingNumberReturns500() {
        int expected = 500;
        int actual = PrintMultiples.returnStartingNumber(500);
        assertEquals(expected, actual);
    }

    @Test
    public void upperBoundReturns1000() {
        int expected = 1000;
        int actual = PrintMultiples.returnUpperBound(1000);
        assertEquals(expected, actual);
    }



}
