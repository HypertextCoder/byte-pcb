import java.util.Scanner;

public class Program_VII_1_SeriesB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = in.nextInt();

        int sum = 0;
        int term = 2;

        for (int i = 1; i <= n; i++) {
            sum += term;
            term *= -2; // Multiply by -2 to alternate signs
        }

        System.out.println("Sum of series (b): " + sum);
    }
}