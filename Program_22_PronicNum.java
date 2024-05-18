public class Program_22_PronicNum {
    public static void main(String[] args) {
        System.out.println("Pronic numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (isPronic(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPronic(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * (sqrt + 1) == num;
    }
}