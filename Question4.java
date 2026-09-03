import java.util.*;

public class Question4 {
    public static boolean isArmstrong(int number){
        int d = 0;
        int t = number;
        int t1 = number;
        while(number>0){
            number/=10;
            d++;
        }
        System.out.println("Digits: "+d);
        int s = 0;
        while(t>0){
            s += Math.pow(t%10,d);
            t/=10;
        }
        if(s==t1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Integer: ");
        int num = sc.nextInt();

        if(isArmstrong(num)){
            System.out.printf("Result: %d is an Armstrong Number.",num);
        }else{
            System.out.printf("Result: %d is not an Armstrong Number",num);
        }
        sc.close();
    }
}
