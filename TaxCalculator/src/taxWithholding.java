import java.util.Scanner;

// Create a tax withholding calculator for weekly income.
// The program should prompt the user for weekly income and then calculate the tax withholding.

public class taxWithholding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input weekly income. (in dollars)
        System.out.print("Enter weekly income: ");
        double income = scanner.nextDouble();

        double taxRate;
        // Use the following table to calculate the tax withholding:
        // Initialize tax rates and establish income thresholds.
        if (income < 500) {
            taxRate = 0.10;
        } else if (income < 1500) {
            taxRate = 0.15;
        } else if (income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }
        // Calculate the tax withholding.
        double taxWithholding = income * taxRate;
        // Calcualte the average tax withholding per week and print out the result.
        System.out.println("Weekly average tax withholding: $" + taxWithholding);

        scanner.close();
    }
}

