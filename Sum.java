import java.util.*;

public class Sum {
  public static int sum(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = input.nextInt();
    int b = input.nextInt();
    System.out.printf("\nsum is %d", sum(a, b));
    input.close();
  }
}