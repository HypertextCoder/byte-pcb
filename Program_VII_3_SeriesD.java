import java.util.Scanner;

public class Program_VII_3_SeriesD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = in.nextInt();

        System.out.print("Enter the number of terms (n): ");
        int n = in.nextInt();

        double sum = 0.0;

        // Calculate sum with alternating signs
        for (int i = 2; i <= n; i++) {
            int sign = (i % 2 == 0) ? 1 : -1; // Alternate signs for even terms
            double term = (double) a / factorial(i); // Cast a to double
            sum += sign * term;
        }

        System.out.println("Sum of series (D): " + sum);
    }

    // Function to calculate factorial (same as previous examples)
    public static double factorial(int n) {
        if (n == 0) {
            return 1.0;
        } else {
            double result = 1.0;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
