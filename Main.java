import java.util.*;

@FunctionalInterface
interface ArrayEvaluator {
    int evaluate(String[] names);

    default void printResult(int result) {
        System.out.println("Evaluation Result: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operationType = scanner.nextLine().trim();
        String[] inputs = scanner.nextLine().trim().split(" ");

        ArrayEvaluator evaluator;

        switch (operationType) {
            case "COUNT_R":
                evaluator = (nums) -> (int) Arrays.stream(nums).filter(num -> num.startsWith("R")).count();
                break;
            default:
                System.out.println("invalid operation");
                scanner.close();
                return;
        }
        int result = evaluator.evaluate(inputs);
        evaluator.printResult(result);
        scanner.close();
    }
}