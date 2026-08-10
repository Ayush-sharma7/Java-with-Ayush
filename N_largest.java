import java.util.*;

public class N_largest{
  public static void display(int arr[]){

    for(int ele : arr){
      System.out.printf("%d ",ele);
    }
  }
  public static void bubbleSort(int arr[], int n){

    for (int i = 0; i < n ; i++) {
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

    System.out.println("enter n largest number: ");
    int n1 = sc.nextInt();
    
    bubbleSort(arr,n1);
    System.out.println("N largest: " + arr[arr.length-n1]);

    sc.close();
    }
}