import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
// Create and instance of AutomobileInventory, and
// add HondaAutomobile objects to the inventory

//AutomobileInventory class designed to manage an inventory of HondaAutomobiles objects
public class AutomobileInventory {
    // List to store the inventory of vehicles
    private List<HondaAutomobiles> inventory;

    //Constructor
    public AutomobileInventory() {
        inventory = new LinkedList<>();
    }

    // Method to add a new vehicle to the inventory
    public String addNewVehicle(HondaAutomobiles vehicle) {
        try {
            inventory.add(vehicle);
            return "Vehicle successfully added \n";
        } catch (Exception e) {
            return "Failed to add vehicle: " + e.getMessage();
        }
    }

    //Method to list all vehicles in the inventory
    public void listAllVehicles() {
        try {
            for (HondaAutomobiles vehicle : inventory) {
                System.out.println(vehicle.getVehicleDetails());
            }
        } catch (Exception e) {
            System.out.println("Failed to list vehicles: " + e.getMessage());
        }
    }

    //Method to remove a vehicle from the inventory
    public String removeVehicle(HondaAutomobiles vehicle) {
        try {
            if (inventory.remove(vehicle)) {
                return "Vehicle successfully removed \n";
            } else {
                return "Vehicle not found in inventory";
            }
        } catch (Exception e) {
            return "Failed to remove vehicle: " + e.getMessage();
        }
    }

    //Method to retrieve the inventory list
    public List<HondaAutomobiles> getInventory() {
        return inventory;
    }
}




