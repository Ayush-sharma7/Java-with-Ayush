import java.util.*;

public class Factorial {
  public static int factorial(int num) {
    int res = 1;
    for (int i = 1; i <= num; i++) {
      res *= i;
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = scanner.nextInt();
    System.out.println("Factorial: " + factorial(num));
    scanner.close();
  }
}