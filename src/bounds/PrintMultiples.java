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

    }



    static int returnStartingNumber(int startingNumber) {
        return startingNumber;

    }

    static int returnUpperBound(int upperBound) {
        return upperBound;
    }
}
