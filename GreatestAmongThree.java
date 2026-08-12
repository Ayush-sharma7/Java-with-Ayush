import java.util.*;

public class GreatestAmongThree {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter three numbers: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      System.out.println(a>b?((a>c)?a:c):(b>c?b:c));
    //   System.out.println(Math.max(Math.max(a,b),c));
      sc.close();
    }
}