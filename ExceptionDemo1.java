public class ExceptionDemo1 {
    static void calculation(int a, int b) {
        try {
            System.out.println("calculation on: " + a + " and " + b);
            int result = a / b;
            System.out.println("Result: " + result);

            int arr[] = new int[] { 24, 345, 436, 54, 7345, 24, 24, 235 };
            System.out.println(arr[a + b]);
        } catch (ArithmeticException ob) {
            System.out.println(ob.getMessage());
            System.out.println(ob.getClass().getSimpleName());
        } catch (ArrayIndexOutOfBoundsException ob) {
            System.out.println(ob.getClass().getSimpleName());
        } finally {
            System.out.println("This is finally block");
        }
    }

    public static void main(String[] args) {
        calculation(4, 1);

        calculation(4, 2);

        calculation(20, 2);

        System.out.println("last statement");
    }
}