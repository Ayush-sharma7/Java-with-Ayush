import java.util.*;

public class SearchProductName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ar[] = { "pen", "pencil", "paneer", "pani", "pizza", "pasta", "butter", "bread" };

        System.out.println("Enter product name: ");
        String name = sc.nextLine();

        for (String s : ar) {
            if (s.startsWith(name)) {
                System.out.println(s);
            }
        }
        sc.close();
    }
}