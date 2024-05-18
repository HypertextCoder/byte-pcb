public class Program_3_Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3; // Initializing the first two Fibonacci numbers
        int count = 20; // Number of Fibonacci numbers to display

        System.out.print(n1 + ", " + n2); // Printing the first two Fibonacci numbers

        for (int i = 2; i < count; i++) {
            n3 = n1 + n2; // Calculating the next Fibonacci number
            System.out.print(", " + n3); // Printing the next Fibonacci number
            n1 = n2; // Updating n1
            n2 = n3; // Updating n2
        }
    }
}