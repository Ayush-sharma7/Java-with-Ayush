import java.util.Scanner;

public class HospitalBedTracker {

    static final int WARDS = 4;
    static final int BEDS_PER_WARD = 5;

    public static void main(String[] args) {
        int[][] beds = {
            {0, 1, 0, 0, 1},
            {1, 0, 0, 0, 0},
            {0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0}
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Current Grid:");
        displayGrid(beds);

        System.out.print("Select Ward (0-" + (WARDS - 1) + "): ");
        int ward = scanner.nextInt();
        System.out.print("Select Bed (0-" + (BEDS_PER_WARD - 1) + "): ");
        int bed = scanner.nextInt();

        allocateBed(beds, ward, bed);

        System.out.println("\nUpdated Grid:");
        displayGrid(beds);

        System.out.println("Available beds remaining: " + countAvailableBeds(beds));

        scanner.close();
    }

    static void displayGrid(int[][] beds) {
        for (int[] ward : beds) {
            StringBuilder row = new StringBuilder();
            for (int bed : ward) {
                row.append(bed).append(" ");
            }
            System.out.println(row.toString().trim());
        }
    }

    static void allocateBed(int[][] beds, int ward, int bed) {
        if (ward < 0 || ward >= WARDS || bed < 0 || bed >= BEDS_PER_WARD) {
            System.out.println("Error: Invalid ward or bed number.");
            return;
        }

        if (beds[ward][bed] == 0) {
            beds[ward][bed] = 1;
            System.out.println("Bed booked successfully!");
        } else {
            System.out.println("Error: Bed already occupied!");
        }
    }
    
    static int countAvailableBeds(int[][] beds) {
        int count = 0;
        for (int[] ward : beds) {
            for (int bed : ward) {
                if (bed == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
