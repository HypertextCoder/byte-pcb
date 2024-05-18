import java.util.Scanner;

public class Program_6_DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter a decimal number: ");
        int decimal = in.nextInt(); // Read the decimal number from the user

        int binary = 0; // Initialize binary number to 0
        int place = 1; // Initialize place value to 1
        while (decimal > 0) {
            binary = binary + (decimal % 2) * place; // Update binary number based on remainder
            decimal = decimal / 2; // Update decimal number by dividing it by 2
            place = place * 10; // Update place value by multiplying it by 10
        }
        System.out.println("Binary equivalent: " + binary); // Display the binary equivalent
    }
}