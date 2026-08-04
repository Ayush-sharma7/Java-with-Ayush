import java.util.*;

public class Calculator {
  public static int sum(int num, int num1) {
    int res = num + num1;
    return res;
  }

  public static int dif(int num, int num1) {
    int res = num - num1;
    return res;
  }

  public static int prod(int num, int num1) {
    int res = num * num1;
    return res;
  }

  public static int div(int num, int num2) {
    if (num2 == 0) {
      System.out.println("ZeroDivision");
      return -1;
    } else {
      int res = num / num2;
      return res;
    }
  }

  public static int mod(int num, int num2) {
    if (num2 == 0) {
      System.out.println("ZeroDivision");
      return -1;
    } else {
      int res = num % num2;
      return res;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number 1: ");
    int num = scanner.nextInt();

    System.out.print("Enter operator(+,-,/,*,%): ");
    char op = scanner.next().charAt(0);

    System.out.print("Enter number 2: ");
    int num2 = scanner.nextInt();

    if (op == '+') {
      System.out.println("Sum: " + sum(num, num2));
    } else if (op == '-') {
      System.out.println("Difference: " + dif(num, num2));
    } else if (op == '*') {
      System.out.println("Product: " + prod(num, num2));
    } else if (op == '/') {
      System.out.println("Divison: " + div(num, num2));
    } else if (op == '%') {
      System.out.println("Modulus: " + mod(num, num2));
    } else {
      System.out.println("Invalid operator!!");
    }
    scanner.close();
  }
}