import java.util.Scanner;

public class Program_5_PerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner for input

        System.out.print("Enter the start of the range: ");
        int start = in.nextInt(); // Read the start of the range

        System.out.print("Enter the end of the range: ");
        int end = in.nextInt(); // Read the end of the range

        System.out.println("Perfect square numbers between " + start + " and " + end + ":");

        // Find the smallest square root that is greater than or equal to the start of the range
        int sqrt = (int) Math.ceil(Math.sqrt(start));

        // Find the square of the smallest square root
        int square = sqrt * sqrt;

        // Iterate through the squares within the range and print them
        while (square <= end) {
            System.out.println(square);
            sqrt++;
            square = sqrt * sqrt;
        }
    }
}