public class Demo1 {
    public static void main(String[] args) {
        int[] num = { 45, 67, 5, 8, 35, 79, 34, 79, 80, 35, 24 };
        int target = 80;
        int atIndex = -1;

        for (int index = 0; index < num.length; index++) {
            if (num[index] == target) {
                atIndex = index;
                break;
            }
        }

        if (atIndex == -1) {
            System.out.printf("%d not present in array.%n", target);
        } else {
            System.out.printf("%d present in array at index %d%n", target, atIndex);
        }
    }
}
