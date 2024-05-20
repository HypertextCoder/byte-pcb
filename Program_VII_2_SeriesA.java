import java.util.Scanner;

public class Program_VII_2_SeriesA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = in.nextInt();

        double sum = 0.0;
        boolean isNegative = false;

        for (int i = 1; i <= n; i++) {
            double term = 1.0 / (2 * i);
            // Add or subtract term based on the sign
            sum += isNegative ? -term : term;
            isNegative = !isNegative; // Toggle sign for next term
        }

        System.out.println("Sum of series (a): " + sum);
    }
}
