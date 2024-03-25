import java.util.Scanner;

public class MyTemperatureProject {
    //declare months as String[]
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        double[] temperatures = new double[12]; // Array to store average temperatures
        Scanner scanner = new Scanner(System.in);

        // This assumes we have temperature data, we can collect it if necessary
        for (int i = 0; i < temperatures.length; i++) {
            // Actual temp data will go here, but for this program I will set up a means for random data
            temperatures[i] = (Math.random() * 100); // Random temperature for demonstration
        }

        System.out.println("Enter the month to view the average temperature or 'year' for yearly data:");
        String input = scanner.nextLine();

        if ("year".equalsIgnoreCase(input)) {
            double sum = 0;
            double highest = temperatures[0];
            double lowest = temperatures[0];
            for (int i = 0; i < months.length; i++) {
                sum += temperatures[i];
                if (temperatures[i] > highest) highest = temperatures[i];
                if (temperatures[i] < lowest) lowest = temperatures[i];
                System.out.println(months[i] + ": " + temperatures[i] + "°C");
            }
            double average = sum / months.length;
            System.out.println("Yearly Average: " + average + "°C");
            System.out.println("Highest Monthly Average: " + highest + "°C");
            System.out.println("Lowest Monthly Average: " + lowest + "°C");
        } else {
            int monthIndex = -1;
            for (int i = 0; i < months.length; i++) {
                if (months[i].equalsIgnoreCase(input)) {
                    monthIndex = i;
                    break;
                }
            }
            if (monthIndex != -1) {
                System.out.println("The Average temperature for " + months[monthIndex] + ": " + temperatures[monthIndex] + "°C");
            } else {
                System.out.println("Invalid month entered. Please try again.");
            }
        }
        scanner.close();
    }
}