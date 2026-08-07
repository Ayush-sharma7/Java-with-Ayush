import java.util.*;

public class FirstArray{
  public static void main(String[] args){
    //declare and initialize with values
    int[] arr1 ={ 1,2,3,4,5};
    //or
    // int arr1[] = {1,2,3,4,5};
    int[] arr;
    //arr={1,2,3,4}

    // using new keyword
    int[] arr2 = new int[5];

    // declare and initialize using new with values
    int[] arr3 = new int[]{1,2,3,4,5};

    int[] arr4;
    arr4 = new int[]{1,2,3,4,5};

    Scanner input = new Scanner(System.in);
    System.out.print("enter the size of array: ");
    int n = input.nextInt();
  }
}