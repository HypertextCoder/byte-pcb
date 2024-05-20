import java.util.Scanner;

public class Program_VII_2_SeriesD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = in.nextInt();

        System.out.print("Enter the value of a: ");
        int a = in.nextInt();

        double sum = 1.0; // Start with 1 for the first term (1)

        for (int i = 2; i <= n; i++) {
            double term = Math.pow(a, 2) / i;
            // Subtract term for alternating signs
            sum -= term;
        }

        System.out.println("Sum of series (d): " + sum);
    }
}
