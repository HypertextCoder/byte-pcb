import java.util.Scanner;

public class Program_VII_1_SeriesD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = in.nextInt();

        System.out.print("Enter the value of a: ");
        int a = in.nextInt();

        int sum = 0;
        int term = 1;

        for (int i = 1; i <= n; i++) {
            sum += term;
            term *= a; // Multiply by a for each term
        }

        System.out.println("Sum of series (d): " + sum);
    }
}
