import java.util.*;

public class StarPattern8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n ; i++){
            for (int k = i; k<n ;k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                if(j==1 || j==i || i==n){
                    System.out.printf("%s ","*");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}