import java.util.Scanner;

public class Program_VII_1_SeriesE {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = in.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * (i + 1); // Product of consecutive numbers
        }

        System.out.println("Sum of series (e): " + sum);
    }
}
