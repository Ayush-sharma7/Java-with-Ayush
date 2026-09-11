import java.util.*;

public class Feedback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String feedback = sc.nextLine();

        int space = 0, vowel = 0, con = 0;
        for (char c : feedback.toCharArray()) {
            if (c == ' ') {
                space++;
            }
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowel++;
                } else {
                    con++;
                }
            }
        }
        System.out.println("total word = " + (space + 1));
        System.out.println("total characters = " + (feedback.length()));
        System.out.println("total vowel = " + (vowel));
        System.out.println("total consonants = " + (con));

        sc.close();
    }
}