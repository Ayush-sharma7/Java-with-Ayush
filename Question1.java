import java.util.*;

public class Question1{
    public static void dispenseChange(int amount){
        int c=0,c1=0,c2=0,c3=0,c4=0,c5=0;
        if(amount>=100){
            c=amount/100;
            amount%=100;
        }
        if(amount>=50){
            c1=amount/50;
            amount%=50;
        }
        if(amount>=20){
            c2=amount/20;
            amount%=20;
        }
        if(amount>=10){
            c3=amount/10;
            amount%=10;
        }
        if(amount>=5){
            c4=amount/5;
            amount%=5;
        }
        c5=amount;
        System.out.printf("$100 Bills: %d\n$50 Bills: %d\n$20 Bills: %d\n$10 Bills: %d\n$5 Bills: %d\n$1 Bills: %d",c,c1,c2,c3,c4,c5);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount: ");
        int n = sc.nextInt();
        dispenseChange(n);
        sc.close();
    }
}