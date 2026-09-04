import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter prices: ");
        double arr[] = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        if (arr.length < 2) {
            System.out.println("Please enter at least two prices.");

            sc.close();
        } 
        else {
            double lowest, lowest2;
        
            if (arr[0] < arr[1]) {
                lowest = arr[0];
                lowest2 = arr[1];
            } else {
                lowest = arr[1];
                lowest2 = arr[0];
            }
            
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] < lowest) {
                    lowest2 = lowest;
                    lowest = arr[i];
                } 
                else if (arr[i] < lowest2 && arr[i] != lowest) {
                    lowest2 = arr[i];
                }
            }
            System.out.printf("Lowest price: $%.2f\nSecond lowest price: $%.2f", lowest, lowest2);

            sc.close();
        }
    }
}
