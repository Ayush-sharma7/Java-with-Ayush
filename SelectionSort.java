class SelectionSort {

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]) {
        // Selection sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            // display(arr); // Show progress after each swap
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 8, 3, 7, 2, 9, 1, 6, 4 };

        System.out.println("Array before sorting: ");
        display(arr);

        selectionSort(arr);

        System.out.println("\nArray after selection sort: ");
        display(arr);
    }
}