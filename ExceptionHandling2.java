import java.util.*;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a even number");
        int n = sc.nextInt();
        try {
            if (n % 2 == 1) {
                throw new ArithmeticException("odd number");
            }

            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("factorial = " + fact);
        } catch (ArithmeticException e) {
            System.out.println(e.toString() + ": you entered odd number");
        } finally {
            sc.close();
        }
    }
}