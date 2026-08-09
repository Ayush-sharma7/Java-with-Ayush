import java.util.*;

public class SwitchCalculator{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter two numbers: ");
    Double a = sc.nextDouble();
    Double b = sc.nextDouble();

    System.out.print("\nEnter expression \n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for modulus: ");
    int op = sc.nextInt();

    switch (op){
      case 1: System.out.println(a+b);
      break;
      case 2: System.out.println(a-b);
      break;
      case 3: System.out.println(a*b);
      break;
      case 4:
      if(b == 0){
        System.out.println("Division by zero not possible");
      }
      else{
        System.out.println(a/b);
      }
      break;
      case 5:
      if(b == 0){
        System.out.println("Modulus by zero not possible");
      }
      else{
        System.out.println(a%b);
      }
      break;
      default: System.out.println("Invalid operator");
    }

    sc.close();
  }
}