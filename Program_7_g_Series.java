public class Program_7_g_Series {
    public static void main(String[] args) {
        int n = 8; // Number of terms in the series
        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            int term = (int)Math.pow(i, 3) - 1;
            System.out.print(term + " ");
        }
    }
}