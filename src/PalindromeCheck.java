import java.util.Scanner;

/**
 * The program checks whether the entered string is a palindrome
 * @data 03.04.2022
 * @author Alex Krentik
 */

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Enter the line to check: ");
        String enteredString = inputString.nextLine();
        String invertedString = "";
        for (int i = 0; i < enteredString.length(); i++) {
            invertedString = enteredString.charAt(i) + invertedString;
        }
        if (invertedString.equalsIgnoreCase(enteredString)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome!");
        }
    }
}
