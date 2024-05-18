import java.util.Scanner;


public class Program_11_PerfectNumber {

    public static void main(String[] args) {

        // Create a Scanner object for taking input

        Scanner in = new Scanner(System.in);


        // Prompt the user to enter a number

        System.out.print("Enter a number: ");

        int number = in.nextInt();


        // Calculate the sum of factors

        int sumOfFactors = 0;

        for (int i = 1; i <= number / 2; i++) {

            if (number % i == 0) {

                sumOfFactors += i;

            }

        }


        // Check if the sum of factors is equal to the original number

        if (sumOfFactors == number) {

            System.out.println(number + " is a perfect number.");

        } else {

            System.out.println(number + " is not a perfect number.");

        }


      

    }

}