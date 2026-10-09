import java.util.*;

public class ExceptionalHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a / b);
            int arr[] = { 1, 2, 3 };
            System.out.println(arr[10]);
        } catch (ArithmeticException e) {
            System.out.println(e.toString() + ": you entered 2nd value 0 please enter another value");
            b = sc.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException ee) {
            System.out.println(ee.toString() + ": You entered wrong value");
        } catch (ArrayIndexOutOfBoundsException ee) {
            System.out.println(ee.toString());
        } finally {
            sc.close();
            System.out.println("this is finally block");
        }
        System.out.println("Hello this is end of program");
    }
}