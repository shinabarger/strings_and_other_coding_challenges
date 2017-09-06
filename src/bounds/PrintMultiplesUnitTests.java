package bounds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/6/17.
 */

public class PrintMultiplesUnitTests {

    @Test
    public void firstTest() {
        int expected = 1;
        int actual = PrintMultiples.returnStartingNumber(1);
        assertEquals(expected, actual);
    }



}
