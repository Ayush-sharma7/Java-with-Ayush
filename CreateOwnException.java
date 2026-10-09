
// creating user define exceptions
import java.util.*;

class ValidAge extends Exception {
    ValidAge(String message) {
        super(message);
    }
}

public class CreateOwnException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a voter age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new ValidAge("Invalid voter age");
            }
            System.out.println("Valid age");
        } catch (ValidAge e) {
            System.out.println(e.toString());
        } finally {
            sc.close();
        }
    }
}