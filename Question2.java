import java.util.*;

public class Question2 {
    public static void calculateMonthlyGrowth(double Principal, double annualRate, int Years){
        double t=Principal;
        double interest = annualRate/1200;
        double monthlyInterest = 0;
        for (int i=1;i<=Years*12; i++){
            monthlyInterest = Principal*interest;
            Principal+=monthlyInterest;
            System.out.printf("Month %d: Interest = %.2f, Balance = %.2f\n",i,monthlyInterest,Principal);
        }
        System.out.println("...");
        System.out.printf("Total Interest Earned: %.2f",Principal-t);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal amount, annualRate and Time(in years): ");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        int years = sc.nextInt();

        calculateMonthlyGrowth(principal,rate,years);

        sc.close();
    }
}
