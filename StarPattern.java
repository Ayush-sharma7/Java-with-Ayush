import java.util.*;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of lines: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.printf("%s", " ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.printf("%s", "*");
            }
            System.out.println();
        }
        sc.close();
    }
}