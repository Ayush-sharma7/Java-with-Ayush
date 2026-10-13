import java.util.Arrays;

class Student {
    private final int rollNumber;
    private final String studentName;
    private final double[] marks;
    private final int numberOfSubjects;

    public Student(int rollNumber, String studentName, double[] marks, int numberOfSubjects) {
        if (studentName == null || studentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty.");
        }
        if (marks == null) {
            throw new IllegalArgumentException("Marks cannot be null.");
        }
        if (numberOfSubjects != marks.length) {
            throw new IllegalArgumentException("Subject count must match the marks array.");
        }

        for (double mark : marks) {
            validateMark(mark);
        }

        this.rollNumber = rollNumber;
        this.studentName = studentName.trim();
        this.marks = marks.clone();
        this.numberOfSubjects = numberOfSubjects;
    }

    public void addMarks(int subjectIndex, double mark) {
        if (subjectIndex < 0 || subjectIndex >= numberOfSubjects) {
            throw new IndexOutOfBoundsException("Enter a valid subject index.");
        }
        validateMark(mark);
        marks[subjectIndex] = mark;
    }

    private static void validateMark(double mark) {
        if (mark < 0 || mark > 100 || Double.isNaN(mark)) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
    }

    public double calculateAverage() {
        if (numberOfSubjects == 0) {
            return 0;
        }

        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / numberOfSubjects;
    }

    public void displayResult() {
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Student name: " + studentName);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.printf("Average marks: %.2f%n", calculateAverage());
        System.out.printf("Result: %.2f%%%n", calculateAverage());
    }
}
