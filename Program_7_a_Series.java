public class Program_7_a_Series {
    public static void main(String[] args) {
        int num = 1;
        System.out.print(num); // Print the first term

        for (int i = 1; i <= 7; i++) { // Loop for the next 7 terms
            num = num * 10 + 1; // Generate the next term
            System.out.print(", " + num); // Print the next term
        }

        System.out.println(); // Move to the next line
    }
}