import java.util.*;

public class BubbleSort {
    public static void display(int arr[]) {

        System.out.println("\nArray Elements: ");
        for (int ele : arr) {
            System.out.printf("%d ", ele);
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        System.out.print("enter number of elements: ");
        size = scanner.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter elements: ");
        for (int index = 0; index < size; index++) {
            arr[index] = scanner.nextInt();
        }

        System.out.println("array before sorting: ");
        display(arr);
        bubbleSort(arr);
        System.out.println();
        System.out.println("Elements after sorting: ");
        display(arr);
        scanner.close();
    }
}