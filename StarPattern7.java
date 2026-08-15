import java.util.*;

public class StarPattern7 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of lines: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
        for (int s = 0; s < n - i; s++) System.out.print(' ');
        for (int j = 0; j < 2 * i - 1; j++) {
            if (j == 0 || j == 2 * i - 2) System.out.print('*');
            else System.out.print(' ');
        }
        System.out.println();
    }
    for (int i = n - 1; i >= 1; i--) {
        for (int s = 0; s < n - i; s++) System.out.print(' ');
        for (int j = 0; j < 2 * i - 1; j++) {
            if (j == 0 || j == 2 * i - 2) System.out.print('*');
            else System.out.print(' ');
        }
        System.out.println();
    }
    sc.close();
    }
}