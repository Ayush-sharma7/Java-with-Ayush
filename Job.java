import java.util.*;

public class Job {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Company name: ");
        String companyName = scanner.nextLine();

        System.out.print("Enter city name: ");
        String cityName = scanner.nextLine();

        System.out.println(companyName + " Technologies " + cityName);
        scanner.close();
    }
}