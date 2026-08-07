import java.util.*;

public class Quadratic{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a,b and c: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    double d = Math.sqrt(b*b-4*a*c);
    double x1 = (-b+d)/(2*a);
    double x2 = (-b-d)/(2*a);

    System.out.println("\nx1= "+x1);
    System.out.println("\nx2= "+x2);

    input.close();
  }
}