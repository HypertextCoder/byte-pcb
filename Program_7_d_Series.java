public class Program_7_d_Series {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            // Calculate the value of the current term
            int term = 0;
            for (int j = 1; j <= i; j++) {
                term = term * 10 + j;
            }

            // Print the current term
            System.out.print(term + " ");
        }
    }
}