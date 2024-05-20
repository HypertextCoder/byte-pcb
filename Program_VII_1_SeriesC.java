import java.util.Scanner;

public class Program_VII_1_SeriesC {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = in.nextInt();

        int sum = 0;
        int term = 1;
        int power = 2;

        for (int i = 1; i <= n; i++) {
            sum += term;
            term *= Math.pow(-4, power); // Alternate signs with increasing power of -4
            power++;
        }

        System.out.println("Sum of series (c): " + sum);
    }
}
