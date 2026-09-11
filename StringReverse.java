import java.util.*;

public class StringReverse {

    static String reverse(String n) {

        char ar[] = n.toCharArray();
        int s = 0, e = ar.length - 1;
        while (s < e) {
            char temp = ar[s];
            ar[s] = ar[e];
            ar[e] = temp;
            s++;
            e--;
        }

        return new String(ar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        String rev = reverse(name);

        System.out.println(rev);

        String sar[] = name.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : sar) {
            sb.append(reverse(s));
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
}