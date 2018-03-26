import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class maven {

    public static void main(String[] args) {

        String userInput = null;
        do {
            System.out.println("\nEnter Something or 0 to quit:");
            userInput = scan.nextLine();
            System.out.println("\nYou Entered " + userInput);
            if (StringUtils.isNumeric(userInput) == true) {
                System.out.println("\n" + userInput + " is a number");
            } else {
                System.out.println("\n" + userInput + " is not a number");
            }

            if (StringUtils.isNumeric(userInput) == false) {
                System.out.println("\nFlipped Case: " + StringUtils.swapCase(userInput));
                System.out.println("\nReversed: " + StringUtils.reverse(userInput));
            }

        } while(!userInput.equals("0"));

    }
        static Scanner scan = new Scanner(System.in);
}
