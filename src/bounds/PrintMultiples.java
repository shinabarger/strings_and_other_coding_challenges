package bounds;

import java.util.Scanner;

/**
 * Created by davidshinabarger on 9/6/17.
 */
public class PrintMultiples {

    public static void main() {

        int startingNumber = 0;
        int upperBound = 0;
        int numberToStepUpWith = 0;

        Scanner scan = new Scanner(System.in);


        System.out.println("We're going to take your magic number and print out until we reach the top number.");

        System.out.println("Enter your starting number: ");
        startingNumber = scan.nextInt();
        returnStartingNumber(startingNumber);

        System.out.println("Enter your upper bound of the range of numbers: ");
        upperBound = scan.nextInt();
        returnUpperBound(upperBound);

        System.out.println("Enter what number you want to increment / step up by:  ");
        numberToStepUpWith = scan.nextInt();
        returnStepSize(numberToStepUpWith);

        printOutStepSize(startingNumber, upperBound, numberToStepUpWith);

    }



    static int returnStartingNumber(int startingNumber) {
        return startingNumber;

    }

    static int returnUpperBound(int upperBound) {
        return upperBound;
    }

    static int returnStepSize(int stepSize) {
        return stepSize;
    }

    static String printOutStepSize(int startingNumber, int upperBound, int stepSize) {
        int temporaryNumber = startingNumber;
        int maxNumbersToPrintInOneLine = getMaxNumbersInALine();
        int numberOfIterations = 0;

        StringBuilder returnMessage = new StringBuilder();

        while (temporaryNumber < upperBound && numberOfIterations <= maxNumbersToPrintInOneLine) {
            System.out.print(temporaryNumber + " ");
            returnMessage.append(temporaryNumber + " ");
            temporaryNumber = temporaryNumber + stepSize;
            numberOfIterations = numberOfIterations + 1;
        }

        return String.valueOf(returnMessage);

    }

    private static int getMaxNumbersInALine() {
        return 10;
    }
}
