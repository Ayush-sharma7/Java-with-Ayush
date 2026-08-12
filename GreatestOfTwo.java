import java.util.*;

public class GreatestOfTwo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter 2 numbers: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      System.out.println(a>b?a:b);
      sc.close();
    }
}