import java.util.Scanner;

public class Main {

    //declare Months as String[]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        double[] temperatures = new double[12]; // Array to store average temperatures
        double sum = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;

        // Example data entry for temperatures
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter the average temperature for " + months[i] + ": ");
            temperatures[i] = scanner.nextDouble();
            sum += temperatures[i];
            if (temperatures[i] > max) max = temperatures[i];
            if (temperatures[i] < min) min = temperatures[i];
        }

        System.out.print("Enter a month to view or 'year' for the yearly summary: ");
        String input = scanner.next();

        // Create loop to handle case for yearly summary, else average temp for entered month.

        if (input.equalsIgnoreCase("year")) {
            System.out.println("Summary of Yearly Temperatures:");
            for (int i = 0; i < months.length; i++) {
                System.out.printf("%s: %.2f°F\n", months[i], temperatures[i]);
            }
            System.out.printf("Yearly Average: %.2f°F\n", sum / months.length);
            System.out.printf("Highest Average: %.2f°F\n", max);
            System.out.printf("Lowest Average: %.2f°F\n", min);
        } else {
            for (int i = 0; i < months.length; i++) {
                if (input.equalsIgnoreCase(months[i])) {
                    System.out.printf("The average temperature for %s is %.2f°F\n", months[i], temperatures[i]);
                    break;
                }
            }
        }

        scanner.close();
    }
}

