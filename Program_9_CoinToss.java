public class Program_9_CoinToss {
    public static void main(String[] args) {
        // Initialize counters for heads and tails
        int headsCount = 0;
        int tailsCount = 0;

        // Simulate 100 coin tosses
        for (int i = 0; i < 100; i++) {
            // Generate a random number between 0.0 (inclusive) and 1.0 (exclusive)
            double toss = Math.random();

            // Increment headsCount if toss is less than 0.5, otherwise increment tailsCount
            if (toss < 0.5) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        // Display the results
        System.out.println("Number of heads: " + headsCount);
        System.out.println("Number of tails: " + tailsCount);
    }
}