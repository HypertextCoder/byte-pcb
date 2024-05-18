public class Program_7_f_Series {
    public static void main(String[] args) {
        int n = 8; // Number of terms in the series
        int firstTerm = 1;
        int diff = 2;
        int currentTerm = firstTerm;
        System.out.print("Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(currentTerm + " ");
            currentTerm += diff;
            diff += 4; // Increasing difference by 4 for each term
        }
    }
}