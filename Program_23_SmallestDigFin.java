import java.util.Scanner;

public class Program_23_SmallestDigFin{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        // Find the smallest digit
        int smallestDigit = 9; // Assuming the number doesn't contain a digit greater than 9
        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            if (digit < smallestDigit) {
                smallestDigit = digit;
            }
            tempNumber /= 10;
        }

        // Display the smallest digit
        System.out.println("Smallest digit is " + smallestDigit);

        
    }
}