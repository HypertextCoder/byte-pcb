import java.util.Scanner;

public class Program_10_ThreeDigitCombinations {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter a 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int number = in.nextInt();

        // Extract the digits
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        // Print all possible combinations of the three digits
        System.out.println("All possible combinations are:");
        System.out.println(digit1 + "" + digit2 + "" + digit3);
        System.out.println(digit1 + "" + digit3 + "" + digit2);
        System.out.println(digit2 + "" + digit1 + "" + digit3);
        System.out.println(digit2 + "" + digit3 + "" + digit1);
        System.out.println(digit3 + "" + digit1 + "" + digit2);
        System.out.println(digit3 + "" + digit2 + "" + digit1);

        
    }
}