import java.util.*;

public class Pattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of lines");
        int n = sc.nextInt();

        int x=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d ",x);
                x++;
            }
            System.out.println();
        }
        sc.close();
    }
}