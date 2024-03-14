import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum = 0f, max = Float.MIN_VALUE, min = Float.MAX_VALUE, grade;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter grade " + i + ": ");
            while (!input.hasNextFloat()) {
                System.out.println("Invalid input. Please enter a floating-point number.");
                input.next(); // clear the invalid input
            }
            grade = input.nextFloat();

            sum += grade;
            if (grade > max) {
                max = grade;
            }
            if (grade < min) {
                min = grade;
            }
        }

        float average = sum / 10;
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Maximum: %.2f\n", max);
        System.out.printf("Minimum: %.2f\n", min);
    }
}
