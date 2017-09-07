package factorial;

import java.util.Scanner;

/**
 * Created by davidshinabarger on 9/6/17.
 */
public class FactorialFun {

    public static void main() {
        runInstructionsToUser();
    }

    private static void runInstructionsToUser() {
        int userNumber = 0;
        String continueGoing = "y";

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the factorial fun machine, where we convert whatever number you put in into a factorial.");

        while (continueGoing.contains("y")) {
            System.out.println("Enter a round number.");
            userNumber = scan.nextInt();
            multiplyTheNumber(userNumber);

            System.out.println("Enter Yes or No to Continue or Exit");
            continueGoing = scan.next();
        }

        System.out.println("Goodbye, thanks for playing. Come again soon.");

    }

    static int multiplyTheNumber(int userNumber) {
        int factorialOfUserNumber = 1;

        for (int i = 1; i <= userNumber; i++) {
            factorialOfUserNumber = userNumber * i;
        }

        System.out.println("factorial of # is " + factorialOfUserNumber);

        return factorialOfUserNumber;
    }
}
