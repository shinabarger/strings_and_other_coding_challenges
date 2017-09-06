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

    @Test
    public void upperBoundReturnsNegative1() {
        int expected = -1;
        int actual = PrintMultiples.returnUpperBound(-1);
        assertEquals(expected, actual);
    }


    @Test
    public void upperBoundReturns2() {
        int expected = 2;
        int actual = PrintMultiples.returnUpperBound(2);
        assertEquals(expected, actual);
    }

    @Test
    public void stepUpNumberReturnsANumber() {
        int expected = 3;
        int actual = PrintMultiples.returnStepSize(3);
        assertEquals(expected, actual);
    }

    @Test
    public void stepUpNumberReturnsANumberInBetweenWithMultiplesAsAString() {
        String expected = "1 ";
        String actual = PrintMultiples.printOutStepSize(1, 2, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void stepUpNumberReturnsAllNumbersInBetweenWithMultiplesAsAString() {
        String expected = "3 5 ";
        String actual = PrintMultiples.printOutStepSize(3, 6, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testToSeeIfOnlyPrints10Numbers() {
        String expected = "1 2 3 4 5 6 7 8 9 10 ";
        String actual = PrintMultiples.printOutStepSize(1, 11, 1);
        assertEquals(expected, actual);
    }



}
