import java.util.*;

public class Starpattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.printf("%2s","*");
                }
                else{
                    System.out.printf("%s","  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}