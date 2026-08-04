public class SecondLargest{
  public static void display(int arr[]){

    System.out.println("\nArray Elements: ");
    for(int ele : arr){
      System.out.printf("%d ",ele);
    }
  }
  static public void bubbleSort(int arr[]){
    for (int i = 0; i < arr.length - 1 ; i++) {
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
      int arr[]={12,234,62,23,534,21,35,2222};
      System.out.println("Og array: ");
      display(arr);
      bubbleSort(arr);
      System.out.println("\n\nSecond largest: " + arr[arr.length-2]);
    }
  }