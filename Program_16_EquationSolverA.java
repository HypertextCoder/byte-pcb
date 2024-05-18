public class Program_16_EquationSolverA {
    public static void main(String[] args) {
        double a = 1;
        double b = -25;
        double c = 144;

        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots of the equation are: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("No real roots exist.");
        }
    }
}