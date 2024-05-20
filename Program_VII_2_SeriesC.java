import java.util.Scanner;

public class Program_VII_2_SeriesC {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = in.nextInt();

        double sum = 1.0; // Start with 1 for the first term

        for (int i = 2; i <= 10; i++) {
            sum += (double) a / i; // Add a divided by current term
        }

        System.out.println("Sum of series (c): " + sum);
    }
}
