//arrays are created dynamically in java and the memory is allocated at the runtime.
//
import java.util.*;

public class FirstArray{
  public static void main(String[] args){
    //declare and initialize with values
    int[] arr1 ={ 1,2,3,4,5};
    System.out.println("arr1: " + Arrays.toString(arr1));
    System.out.println(arr1);  //[I@a09ee92 this is the hexadecimal code which refers to the reference to a 1D array one '[' bracket means 1D array
    
    // using new keyword, new keyword refers the new memory location 
    //array default value i.e. arr[x] is 0. 
    int[] arr2 = new int[5];
    System.out.println("arr2: " + Arrays.toString(arr2));

    // declare and initialize using new with values
    int[] arr3 = new int[]{1,2,3,4,5};
    System.out.println("arr3: " + Arrays.toString(arr3));

    int[] arr4;
    arr4 = new int[]{1,2,3,4,5};
    System.out.println("arr4: " + Arrays.toString(arr4));

    int arr5[] = null;
    //this is a null array with no memory location.

    try (Scanner input = new Scanner(System.in)) {
      System.out.print("enter the size of array: ");
      int n = input.nextInt();
      System.out.println("Array size: " + n);
    }
  }
}