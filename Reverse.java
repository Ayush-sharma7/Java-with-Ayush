import java.util.*;

public class Reverse {
  public static int reverse(int num) {
    int rev = 0;
    while (num != 0) {
      rev = rev * 10 + (num % 10);
      num /= 10;
    }
    return rev;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    System.out.println("Reverse: " + reverse(num));
    scanner.close();
  }
}