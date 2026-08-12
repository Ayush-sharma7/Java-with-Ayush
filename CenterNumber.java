import java.util.*;

public class CenterNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println((a + b + c) - Math.max(Math.max(a, b), c) - Math.min((Math.min(a, b)), c));
    sc.close();
  }
} 