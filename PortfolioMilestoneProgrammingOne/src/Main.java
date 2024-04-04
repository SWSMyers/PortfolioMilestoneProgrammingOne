
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//Main class demonstrates the usage of the HondaAutomobiles and AutomobileInventory classes
public class Main {
    public static void main(String[] args) {
        // Create an instance of AutomobileInventory
        AutomobileInventory inventory = new AutomobileInventory();
        // Introduce Scanner object to read the users input
        try (Scanner scanner = new Scanner(System.in)) {

            try {
                // Add vehicles to the inventory using the parameterized constructor
                HondaAutomobiles auto1 = new HondaAutomobiles("Honda", "Civic", "Black", 2022, 16000);
                HondaAutomobiles auto2 = new HondaAutomobiles("Honda", "Ridgeline", "Graphite", 2023, 9500);
                HondaAutomobiles auto3 = new HondaAutomobiles("Honda", "Pilot", "Sky Blue", 2024, 127);
                HondaAutomobiles auto4 = new HondaAutomobiles("Honda", "Accord", "Red", 2021, 26000);
                //output the result of adding vehicles
                System.out.println(inventory.addNewVehicle(auto1));
                System.out.println(inventory.addNewVehicle(auto2));
                System.out.println(inventory.addNewVehicle(auto3));
                System.out.println(inventory.addNewVehicle(auto4));
                System.out.println();

                // List all vehicles
                inventory.listAllVehicles();

                // Remove a vehicle from the inventory and output the result
                System.out.println(inventory.removeVehicle(auto1));

                // List all vehicles to confirm removal
                inventory.listAllVehicles();

                // Ask user if they want to print the information to a file
                System.out.println();
                System.out.println("Do you want to print the information to a file (Y or N)?");
                // Read the user response
                String response = scanner.nextLine();
                // Check if the user wants to print the information to a file
                if ("Y".equalsIgnoreCase(response)) {
                    // Call method to print information to a file
                    printToFile(inventory, "C:\\Temp\\Autos.txt");
                    // Inform the user that the information has been printed
                    System.out.println("Information printed to file.");
                } else {
                    // Print any exceptions that occur
                    System.out.println("A file will not be printed.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                e.printStackTrace();
            } finally {
                // Close the scanner object
                scanner.close();
            }
        }
    }

    // Method to print information to a file
    private static void printToFile(AutomobileInventory inventory, String filePath) {
        try (PrintWriter out = new PrintWriter(filePath)) {
            // Iterate over the inventory and print each vehicle's details to the file
            for (HondaAutomobiles vehicle : inventory.getInventory()) {
                out.println(vehicle.getVehicleDetails());
            }
        } catch (FileNotFoundException e) {
            // Print an error message if the file isn't found
            System.out.println("Error printing to file: " + e.getMessage());
        }
    }
}

