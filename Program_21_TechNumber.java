public class Program_21_TechNumber {
    public static void main(String[] args) {
        for (int num = 1000; num < 10000; num++) {
            int firstHalf = num / 100;
            int secondHalf = num % 100;
            if ((firstHalf + secondHalf) * (firstHalf + secondHalf) == num) {
                System.out.println(num);
            }
        }
    }
}