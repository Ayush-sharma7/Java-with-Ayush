// 1
// 01
// 010
// 1010
// 10101
// 010101
import java.util.*;

public class ZeroPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();

        int x=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if(x==0){
                    System.out.printf("%d ",1);
                    x=1;
                }else{
                    System.out.printf("%d ",0);
                    x=0;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}