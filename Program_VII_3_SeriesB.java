import java.util.Scanner;

public class Program_VII_3_SeriesB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = in.nextInt();

        System.out.print("Enter the number of terms (n): ");
        int n = in.nextInt();

        double sum = 0.0;

        // Calculate sum for odd terms only
        for (int i = 1; i <= n; i += 2) {
            double term = Math.pow(a, i);
            double factorial = 1.0;
            for (int j = 1; j <= i; j++) {
                factorial *= j; // Calculate factorial within the loop
            }
            sum += term / factorial;
        }

        System.out.println("Sum of series (B): " + sum);
    }
}
