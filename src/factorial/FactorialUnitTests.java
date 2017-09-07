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


}
