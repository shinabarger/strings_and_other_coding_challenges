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
        double userAverageInFahr = 0.0;
        double userAverageInCelsius = 0.0;
        double fahrenheitTotal = 0.0;
        double celsiusTotal = 0.0;
        int totalNumberOfNumbersInputted = 0;

        Scanner scan = new Scanner(System.in);

        while (userNumber <= -100.0) {
            System.out.println("Enter Temp in Centigrade or <= -100.0 to quit: ");
            userNumber = scan.nextDouble();

            System.out.println("You entered: " + userNumber + " degrees Celsius.");
            temperatureInFahrenheit = convertToFahrenheit(userNumber);
            System.out.println("This is " + temperatureInFahrenheit + " degrees Fahrenheit.");
            fahrenheitTotal = fahrenheitTotal + temperatureInFahrenheit;
            celsiusTotal = celsiusTotal + userNumber;
            totalNumberOfNumbersInputted++;

        }

        userAverageInFahr = getUserAverageInFahr(fahrenheitTotal, totalNumberOfNumbersInputted);
        System.out.println("Your average in fahrenheit is " + userAverageInFahr);

        userAverageInCelsius = getUserAverageInCelsius(celsiusTotal, totalNumberOfNumbersInputted);
        System.out.println("Your average in Celsius is " + userAverageInCelsius);

    }

    static double convertToFahrenheit(double userNumber) {
        double temperatureInFahreneit = ((9.0 / 5.0) * userNumber + 32.0);
        return temperatureInFahreneit;
    }

    static double getUserAverageInFahr(double fahrenheitTotal, double totalNumberOfNumbersInputted) {
        double userAverageInFahr = (fahrenheitTotal / totalNumberOfNumbersInputted);
        return userAverageInFahr;
    }

    static double getUserAverageInCelsius(double celsiusTotal, int totalNumberOfNumbersInputted) {
        double celsiusAverage = (celsiusTotal / totalNumberOfNumbersInputted);
        return celsiusAverage;
    }
}
