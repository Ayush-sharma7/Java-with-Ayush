public class Array {
  public static void main(String[] args) {
    int arr[] = { 12, 45, 78, 3, 56, 89, 23, 11 };
    double avg = 0;
    int min = arr[0];
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
      avg += arr[i];
    }
    System.out.println("Max. Value: " + max + "\nMin. Value: " + min + "\nAverage: " + avg / arr.length);
  }
}