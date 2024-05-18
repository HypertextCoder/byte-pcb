import java.util.Scanner;

public class Program_VII_1_SeriesA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = in.nextInt();

        int sum = 0;
        int term = -1;

        for (int i = 1; i <= n; i++) {
            sum += term;
            term = (term == -1) ? 0 : 3; // Toggle between -1 and 3
        }

        System.out.println("Sum of series (a): " + sum);
    }
}