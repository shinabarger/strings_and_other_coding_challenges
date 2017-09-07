package alphabet;

/**
 * Created by davidshinabarger on 9/6/17.
 */
public class PrintAtoZFizzBuzz {

    public static void main() {
        runTheInstructions();
    }

    private static void runTheInstructions() {

        char characterToPrint;

        for (characterToPrint = 'a'; characterToPrint <= 'z'; characterToPrint++) {
            System.out.print(characterToPrint);
            checkIfVowel(characterToPrint);
        }
    }

    private static void checkIfVowel(char characterToPrint) {
        if ((characterToPrint == 'a') || (characterToPrint == 'e') || (characterToPrint == 'i')
                || (characterToPrint == 'o') || (characterToPrint == 'u')) {
            System.out.println(" is a vowel.");
        } else {
            System.out.println(" is a consonent");
        }
    }

}
