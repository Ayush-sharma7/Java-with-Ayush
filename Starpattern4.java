//Inverted Triangle
import java.util.*;

public class Starpattern4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1 ; i--){
            for (int k =1; k<=n-i; k++){
                System.out.printf("%s"," ");
            }
            for (int j = 2*i-1; j>=1;j--){
                System.out.printf("%s","*");
            }
            System.out.println();
        }
        sc.close();
    }
}