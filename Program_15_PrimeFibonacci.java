import java.util.Scanner;
import java.util.Arrays;

public class Program_13_DigitsDescendingOrder {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        String number = in.next();

        // Convert the number to a char array to sort its digits
        char[] digits = number.toCharArray();

        // Sort the digits array in descending order
        Arrays.sort(digits);

        // Reverse the sorted array to get descending order
        for (int i = 0; i < digits.length / 2; i++) {
            char temp = digits[i];
            digits[i] = digits[digits.length - 1 - i];
            digits[digits.length - 1 - i] = temp;
        }

        // Convert the sorted array back to a string and display the result
        String sortedNumber = new String(digits);
        System.out.println("Number with digits in descending order: " + sortedNumber);
    }
}