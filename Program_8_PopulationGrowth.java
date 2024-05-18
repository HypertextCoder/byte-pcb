import java.util.Scanner;

public class Program_8_PopulationGrowth {
    public static void main(String[] args) {
        // Create a Scanner object for taking inputs
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter the initial population
        System.out.print("Enter the initial population (P): ");
        double P = in.nextDouble();  // Store the initial population

        // Prompt the user to enter the annual growth rate in percentage
        System.out.print("Enter the annual growth rate (R) in percentage: ");
        double R = in.nextDouble();  // Store the growth rate

        // Print the population at the end of each year from 2000 to 2010
        System.out.println("Population Growth from 2000 to 2010:");
        for (int year = 2000; year <= 2010; year++) {
            // Calculate the population at the end of the current year
            double A = P * Math.pow(1 + R / 100, year - 2000);
            // Print the year and the corresponding population
            System.out.println("Population at the end of " + year + ": " + A);
        }
    }
}