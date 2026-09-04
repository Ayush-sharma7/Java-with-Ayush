import java.util.*;

public class Question5 {
    public static void binarySearchBatch(int[] batches, int target) {
        int start = 0; 
        int end = batches.length - 1; 
        boolean found = false;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (batches[mid] == target) {
                System.out.println("Found at index: " + mid);
                found = true;
                break;
            } else if (batches[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Target not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Batch IDs (sorted): ");
        int[] batches = Arrays.stream(sc.nextLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();

        System.out.print("Enter target batch ID: ");
        int target = sc.nextInt();

        binarySearchBatch(batches, target);
        sc.close();
    }
}
