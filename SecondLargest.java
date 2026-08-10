import java.util.*;

public class SecondLargest{
  public static void display(int arr[]){

    for(int ele : arr){
      System.out.printf("%d ",ele);
    }
  }
  public static void bubbleSort(int arr[]){

    for (int i = 0; i < 2 ; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
  }
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter elements: ");
    for (int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    
    bubbleSort(arr);
    System.out.println("Second largest: " + arr[arr.length-2]);

    sc.close();
    }
  }