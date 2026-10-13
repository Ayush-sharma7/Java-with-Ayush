import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int rollNumber = readInt(scanner, "Enter roll number: ");
            int numberOfSubjects = readNonNegativeInt(scanner, "Enter number of subjects: ");
            double[] marks = new double[numberOfSubjects];

            for (int i = 0; i < marks.length; i++) {
                marks[i] = readMark(scanner, "Enter mark for subject " + (i + 1) + ": ");
            }

            scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine().trim();
            while (name.isEmpty()) {
                System.out.print("Student name cannot be empty. Enter student name: ");
                name = scanner.nextLine().trim();
            }

            Student student = new Student(rollNumber, name, marks, numberOfSubjects);
            student.displayResult();
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Enter a valid whole number.");
            scanner.next();
        }
    }

    private static int readNonNegativeInt(Scanner scanner, String prompt) {
        int value;
        do {
            value = readInt(scanner, prompt);
            if (value < 0) {
                System.out.println("The number of subjects cannot be negative.");
            }
        } while (value < 0);
        return value;
    }

    private static double readMark(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double mark = scanner.nextDouble();
                if (mark >= 0 && mark <= 100 && !Double.isNaN(mark)) {
                    return mark;
                }
                System.out.println("Enter a mark between 0 and 100.");
            } else {
                System.out.println("Enter a valid number.");
                scanner.next();
            }
        }
    }
}
