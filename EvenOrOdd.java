import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a numbers: ");
      int a = sc.nextInt();
      System.out.println((a&1)==0?"Even":"Odd");
      sc.close();
    }
}