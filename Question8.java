import java.util.*;

public class Question8 {

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

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Quarterly Revenues: ");
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.printf("\n\n===============================\nCorporate Sales Performance Report\n===============================\n\nTotal Managers Evaluated : 30\n\nTop Performer Revenue     : %d\nLowest Performer Revenue  : %d\nMean Quarterly Revenue    : %.2f\nManagers Above Average    : %d\nManagers Below Average    : %d\n\n===============================\nEnd of Report \n=============================== ",findMax(arr),findMin(arr),calcTotal(arr)/(arr.length*1.0),countAboveAverage(arr),arr.length-countAboveAverage(arr));

        sc.close();
    }
}
