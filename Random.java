import java.util.*;

public class Random{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter max and min range: ");
    int max = input.nextInt();
    int min = input.nextInt();

    double num = Math.random()*(max-min+1)+min;

    System.out.printf("Random number between given range is: %.0f",num);

    input.close();
  }
}