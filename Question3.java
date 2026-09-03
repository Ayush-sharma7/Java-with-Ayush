import java.util.*;

public class Question3 {
    public static void convertToCelsius(double fahrenheit){

        double C = (fahrenheit-32)*(5.0/9);
        System.out.printf("Temperature in Celcius: %.2f\n",C);
        System.out.print("Advisory: ");
        if(C<0){
            System.out.println("Freezing Warning - Ice Alert");
        }else if(C>=0 && C<=15){
            System.out.println("Cold Weather Advisory");
        }else if(C>=16 && C<=30){
            System.out.println("Moderate/Pleasant Weather");
        }else{
            System.out.println("Heat Advisory - Stay Hydrated");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        convertToCelsius(f);
        sc.close();
    }
}
