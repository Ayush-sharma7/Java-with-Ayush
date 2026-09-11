import java.util.*;

public class PasswordCheck{
    static boolean Password(String psw){
        if(psw.length()<8){
            return false;
        }

        boolean upper = false, lower = false, digit = false, special = false;
        for(char c: psw.toCharArray())
        {
            if(c>='A' && c<='Z'){
                upper = true;
            }
            else if(c>='a' && c<='z'){
                lower = true;
            }
            else if(c>='0' && c<='9'){
                digit = true;
            }
            else if(c!=' '){
                special = true;
            }
        }
        return upper && lower && digit && special;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter your password: ");
            String psw = sc.nextLine();

            System.out.println(Password(psw)?"Strong":"Not Strong");

            sc.close();
    }
}