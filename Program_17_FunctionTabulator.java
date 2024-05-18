public class Program_17_FunctionTabulator {
    public static void main(String[] args) {
        System.out.println("x\t|\tf(x)");
        System.out.println("--------------------");
        for (int x = -10; x <= 10; x++) {
            int result = 2 * x * x - 3 * x - 5;
            System.out.println(x + "\t|\t" + result);
        }
    }
}