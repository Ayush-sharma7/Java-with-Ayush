import java.util.*;

public class Area {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter radius: ");
    int rad = input.nextInt();
    double area = Math.PI * rad * rad;

    System.out.println("\nArea: " + area);

    input.close();
  }
}