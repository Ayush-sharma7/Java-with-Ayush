import java.util.*;

public class FirstArray{
  public static void main(String[] args){
    //declare and initialize with values
    int[] arr1 ={ 1,2,3,4,5};
    System.out.println("arr1: " + Arrays.toString(arr1));
    
    // using new keyword
    int[] arr2 = new int[5];
    System.out.println("arr2: " + Arrays.toString(arr2));

    // declare and initialize using new with values
    int[] arr3 = new int[]{1,2,3,4,5};
    System.out.println("arr3: " + Arrays.toString(arr3));

    int[] arr4;
    arr4 = new int[]{1,2,3,4,5};
    System.out.println("arr4: " + Arrays.toString(arr4));

    try (Scanner input = new Scanner(System.in)) {
      System.out.print("enter the size of array: ");
      int n = input.nextInt();
      System.out.println("Array size: " + n);
    }
  }
}