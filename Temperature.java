import java.util.*;

public class Temperature {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter 1 for Celcius to Fahrenheit or\nEnter 2 for Fahrenheit to Celcius: ");
    int op = scanner.nextInt();

    if (op == 1) {
      System.out.println("Enter temperature in Celcius");
      int cel = scanner.nextInt();
      System.out.println("Temperature in Fahrenheit is: " + (cel * (9.0 / 5.0) * 32));
    } else {
      System.out.println("Enter temperature in Fahrenheit: ");
      int fah = scanner.nextInt();
      System.out.println("Temperature in celcius is: " + (fah - 32) * 9.0 / 5.0);
    }
    scanner.close();
  }
}