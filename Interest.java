import java.util.*;

public class Interest{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Principle, Rate and Time: ");
    double p = input.nextDouble();
    double r = input.nextDouble();
    double t = input.nextDouble();

    double interest = p*r*t/100;
    double ci = p*Math.pow(1+r/100,t)-p;  //compound interest

    System.out.println("\nInterest: " + interest);
    System.out.println("CompoundInterest: " + ci);
    
    input.close();
  }
}