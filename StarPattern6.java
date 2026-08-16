import java.util.*;

public class StarPattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = i; k <= n; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%s ", "*");
            }
            System.out.println();
        }
        sc.close();
    }
}