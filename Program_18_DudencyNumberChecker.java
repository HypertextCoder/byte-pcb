import java.util.Scanner;

public class Program_18_DudencyNumberChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        in.close();

        int sumOfDigits = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            temp /= 10;
        }

        int cubeOfSum = sumOfDigits * sumOfDigits * sumOfDigits;

        if (cubeOfSum == number) {
            System.out.println(number + " is a Dudency number.");
        } else {
            System.out.println(number + " is not a Dudency number.");
        }
    }
}