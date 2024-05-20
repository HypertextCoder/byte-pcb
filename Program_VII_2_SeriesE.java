import java.util.Scanner;

public class Program_VII_2_SeriesE {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = in.nextInt();

        double sum = 0.0;
        int product = 1;

        for (int i = 1; i <= n; i++) {
            product *= (i + 1);
            sum += (double) (i * product) / (i * (i + 1) / 2); // Efficient calculation using divisibility
        }

        System.out.println("Sum of series (e): " + sum);
    }
}
