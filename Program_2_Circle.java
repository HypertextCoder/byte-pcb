import java.util.Scanner;

public class Program_2_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object for input
        double radius; // Variable to store the radius of the circle

        System.out.print("Enter the radius of the circle (0 to quit): ");
        radius = in.nextDouble(); // Read radius from user

        if (radius != 0) {
            // Calculate the area of the circle
            double area = Math.PI * radius * radius;

            // Calculate the circumference of the circle
            double circumference = 2 * Math.PI * radius;

            // Display the area and circumference
            System.out.println("Area of the circle: " + area);
            System.out.println("Circumference of the circle: " + circumference);
        } else {
            // Output message if radius is 0
            System.out.println("Program terminated.");
        }
    }
}