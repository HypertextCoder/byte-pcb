import java.util.Scanner;

public class Program_24_AdamChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the square of the number
        int square = number * number;

        // Reverse the number and its square
        int reverseNumber = reverse(number);
        int reverseSquare = reverse(square);

        // Check if the reverse of the square is equal to the square of the reverse
        if (reverseSquare == squareOf(reverseNumber)) {
            System.out.println(number + " is an Adam number.");
        } else {
            System.out.println(number + " is not an Adam number.");
        }

        scanner.close();
    }

    // Function to reverse a number
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    // Function to calculate square of a number
    public static int squareOf(int n) {
        return n * n;
    }
}