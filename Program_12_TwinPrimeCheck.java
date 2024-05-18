import java.util.Scanner;

public class Program_12_TwinPrimeCheck {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        // Check if both numbers are prime
        boolean isNum1Prime = true;
        boolean isNum2Prime = true;

        if (num1 <= 1) {
            isNum1Prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num1); i++) {
                if (num1 % i == 0) {
                    isNum1Prime = false;
                    break;
                }
            }
        }

        if (num2 <= 1) {
            isNum2Prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num2); i++) {
                if (num2 % i == 0) {
                    isNum2Prime = false;
                    break;
                }
            }
        }

        // Check if both numbers are prime and differ by 2
        if (isNum1Prime && isNum2Prime && Math.abs(num1 - num2) == 2) {
            System.out.println(num1 + " and " + num2 + " are twin primes.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not twin primes.");
        }
    }
}