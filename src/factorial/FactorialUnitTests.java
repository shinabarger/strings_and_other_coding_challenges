package factorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/6/17.
 */

public class FactorialUnitTests {

    @Test
    public void returnsFactorialOfOne() {
        int expected = 1;
        int actual = FactorialFun.multiplyTheNumber(1);
        assertEquals(expected, actual);
    }

    @Test
    public void returnsFactorialOfTwo() {
        int expected = 2;
        int actual = FactorialFun.multiplyTheNumber(2);
        assertEquals(expected, actual);
    }

    @Test
    public void returnsFactorialOf4() {
        int expected = 24;
        int actual = FactorialFun.multiplyTheNumber(4);
        assertEquals(expected, actual);
    }

    @Test
    public void returnsFactorialOf3() {
        int expected = 6;
        int actual = FactorialFun.multiplyTheNumber(3);
        assertEquals(expected, actual);
    }

    @Test
    public void returnsFactorialOf6() {
        int expected = 720;
        int actual = FactorialFun.multiplyTheNumber(6);
        assertEquals(expected, actual);
    }




}
