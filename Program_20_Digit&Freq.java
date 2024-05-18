import java.util.Scanner;

public class Program_20_Digit&Freq  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1 to check frequency or 2 to sum even digits:");
        int choice = in.nextInt();

        System.out.println("Enter number:");
        int n = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter digit:");
                int dig = in.nextInt();
                int f = 0;
                while (n != 0) {
                    int d = n % 10;
                    if (d == dig) {
                        f++;
                    }
                    n = n / 10;
                }
                System.out.println("Frequency of digit " + dig + ": " + f);
                break;
            case 2:
                int sum = 0;
                while (n != 0) {
                    int d = n % 10;
                    if (d % 2 == 0) {
                        sum += d;
                    }
                    n = n / 10;
                }
                System.out.println("Sum of even digits: " + sum);
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}