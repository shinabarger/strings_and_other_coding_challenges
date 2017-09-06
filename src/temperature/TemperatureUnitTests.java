package temperature;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/6/17.
 */

public class TemperatureUnitTests {

    @Test
    public void conversionOfTwentyToSixtyEightWorksJustGroovyBaby() {
        double expected = 68.0;
        double actual = ConvertTheTemperature.convertToFahrenheit(20.0);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void thirtyConvertsToEightySix() {
        double expected = 86.0;
        double actual = ConvertTheTemperature.convertToFahrenheit(30.0);
        assertEquals(expected, actual, 0.001);
    }






}
