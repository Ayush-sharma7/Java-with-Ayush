public class InsertionSort {
  public static void display(int arr[]) {
    System.out.println("\nArray elements: ");
    for (int eachElement : arr) {
      System.out.printf("%d ", eachElement);
    }
  }

  public static void insertionSort(int arr[]) {

    // algorithm
    // assume the first element is already sorted
    // pick the next element(called the key)
    // compare the key with the elements before it.
    // shift all elements greater than the currentElement
    // insert the key into its correct position
    // repeat until all elements are sorted
    
    for (int i = 1; i < arr.length; i++) {
      int currentElement = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > currentElement) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = currentElement;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 12, 34, 6123, 12, 32, 432, 615, 12, 34, 51, 32, 61, 2, 58 };
    display(arr);
    insertionSort(arr);
    display(arr);
  }
}