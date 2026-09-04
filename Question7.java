import java.util.*;

public class Question7 {

    public static int calcTotal(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static int findMax(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int arr[]) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int countAboveAverage(int arr[]) {
        double avg = calcTotal(arr) / (arr.length * 1.0);
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Durations: ");
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.printf("Total Minutes: %d\nAverage Duration: %.2f\nMax Duration: %d mins | Min Duration: %d mins\nAgents above average: %d" ,calcTotal(arr),calcTotal(arr)/(arr.length*1.0),findMax(arr),findMin(arr),countAboveAverage(arr));

        sc.close();
    }
}
