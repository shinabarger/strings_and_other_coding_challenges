package temperature;

import java.util.Scanner;

/**
 * Created by davidshinabarger on 9/6/17.
 */
public class ConvertTheTemperature {

    public static void main() {

        runTheProgram();

    }

    private static void runTheProgram() {
        double temperatureInFahrenheit = 0.0;
        double userNumber = 0.0;

        Scanner scan = new Scanner(System.in);

        while(userNumber <= -100.0) {
            System.out.println("Enter Temp in Centigrade or <= -100.0 to quit: ");
            userNumber = scan.nextDouble();

            System.out.println("You entered: " + userNumber + " degrees Celsius.");
            temperatureInFahrenheit = convertToFahrenheit(userNumber);
            System.out.println("This is " + temperatureInFahrenheit + " degrees Fahrenheit.");

        }

    }

    static double convertToFahrenheit(double userNumber) {
        double temperatureInFahreneit = ((9.0/5.0)*userNumber + 32.0);
        return temperatureInFahreneit;
    }
}
