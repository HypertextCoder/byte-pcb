public class Program_7_e_Series {
    public static void main(String[] args) {
        int n = 8; // Number of terms in the series
        int firstTerm = 2;
        int diff = 3;
        int currentTerm = firstTerm;
        System.out.print("Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(currentTerm + " ");
            currentTerm += diff;
            diff += 2; // Increasing difference by 2 for each term
        }
    }
}