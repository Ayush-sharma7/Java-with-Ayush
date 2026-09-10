import java.util.Scanner;

/**
 * Question 10: Urban Traffic Sensor Grid Flow Analysis [Advanced]
 *
 * Monitors traffic counts at 4 major intersections over 7 days of the week,
 * stored in a 4x7 2-D array (rows = intersections, columns = days).
 */
public class TrafficGridAnalysis {

    static final int INTERSECTIONS = 4;
    static final int DAYS = 7;
    static final String[] DAY_NAMES = {
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] traffic = new int[INTERSECTIONS][DAYS];

        inputTrafficData(scanner, traffic);

        System.out.println("\n--- Weekly Totals ---");
        int[] weeklyTotals = computeWeeklyTotals(traffic);
        for (int i = 0; i < INTERSECTIONS; i++) {
            System.out.println("Intersection " + (i + 1) + ": " + weeklyTotals[i]);
        }

        System.out.println("\n--- Daily Averages ---");
        double[] dailyAverages = computeDailyAverages(weeklyTotals);
        for (int i = 0; i < INTERSECTIONS; i++) {
            System.out.printf("Intersection %d: %.2f%n", i + 1, dailyAverages[i]);
        }

        System.out.println("\n--- Highest Weekly Traffic ---");
        reportHighestIntersection(weeklyTotals);

        System.out.println("\n--- Busiest Day Citywide ---");
        reportBusiestDay(traffic);

        System.out.print("\nEnter congestion threshold (avg daily traffic): ");
        double threshold = scanner.nextDouble();
        System.out.println("\n--- Intersections Exceeding Threshold ---");
        reportCongestedIntersections(dailyAverages, threshold);

        scanner.close();
    }

    /**
     * Reads traffic count data for each intersection across all 7 days.
     */
    static void inputTrafficData(Scanner scanner, int[][] traffic) {
        for (int i = 0; i < INTERSECTIONS; i++) {
            for (int d = 0; d < DAYS; d++) {
                System.out.print("Intersection " + (i + 1) + " - " + DAY_NAMES[d] + " traffic count: ");
                traffic[i][d] = scanner.nextInt();
            }
        }
    }

    /**
     * Computes the total weekly traffic count for each intersection.
     */
    static int[] computeWeeklyTotals(int[][] traffic) {
        int[] totals = new int[INTERSECTIONS];
        for (int i = 0; i < INTERSECTIONS; i++) {
            int sum = 0;
            for (int d = 0; d < DAYS; d++) {
                sum += traffic[i][d];
            }
            totals[i] = sum;
        }
        return totals;
    }

    /**
     * Computes the average daily traffic for each intersection from weekly totals.
     */
    static double[] computeDailyAverages(int[] weeklyTotals) {
        double[] averages = new double[INTERSECTIONS];
        for (int i = 0; i < INTERSECTIONS; i++) {
            averages[i] = (double) weeklyTotals[i] / DAYS;
        }
        return averages;
    }

    /**
     * Identifies and reports the intersection with the highest overall weekly traffic.
     */
    static void reportHighestIntersection(int[] weeklyTotals) {
        int maxIndex = 0;
        for (int i = 1; i < INTERSECTIONS; i++) {
            if (weeklyTotals[i] > weeklyTotals[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Intersection " + (maxIndex + 1) + " with a total of " + weeklyTotals[maxIndex] + " vehicles.");
    }

    /**
     * Identifies and reports the busiest day of the week across the entire city
     * by summing traffic across all intersections for each day.
     */
    static void reportBusiestDay(int[][] traffic) {
        int[] dayTotals = new int[DAYS];
        for (int d = 0; d < DAYS; d++) {
            int sum = 0;
            for (int i = 0; i < INTERSECTIONS; i++) {
                sum += traffic[i][d];
            }
            dayTotals[d] = sum;
        }

        int maxDay = 0;
        for (int d = 1; d < DAYS; d++) {
            if (dayTotals[d] > dayTotals[maxDay]) {
                maxDay = d;
            }
        }
        System.out.println(DAY_NAMES[maxDay] + " with a citywide total of " + dayTotals[maxDay] + " vehicles.");
    }

    /**
     * Lists intersections whose average daily traffic exceeds the given congestion threshold.
     */
    static void reportCongestedIntersections(double[] dailyAverages, double threshold) {
        boolean found = false;
        for (int i = 0; i < INTERSECTIONS; i++) {
            if (dailyAverages[i] > threshold) {
                System.out.printf("Intersection %d - avg daily traffic: %.2f (exceeds threshold)%n", i + 1, dailyAverages[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No intersections exceed the given threshold.");
        }
    }
}
