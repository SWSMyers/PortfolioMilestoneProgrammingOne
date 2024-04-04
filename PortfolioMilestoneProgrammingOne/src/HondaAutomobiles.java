import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*The purpose is to create a program to handle the inventory for a hypothetical
  car dealership.  In this case I will be using Honda as the primary manufacturer
  for the dealership's inventory.
  declare the data types for each element to be logged by the inventory program/**

 */
// Create a class that represents Honda automobiles with attributes and methods
public class HondaAutomobiles {
    // Attributes of the HondaAutomobiles class
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor initializes the object with default values
    public HondaAutomobiles() {
        make    = "";
        model   = "";
        color   = "";
        year    = 0;
        mileage = 0;
    }

    // Parameterized constructor to initialize the object with specific values
    public HondaAutomobiles(String make, String model, String color, int year, int mileage) {
        this.make    = make;
        this.model   = model;
        this.color   = color;
        this.year    = year;
        this.mileage = mileage;
    }

    // Method to return the vehicle's details as a string
    public String getVehicleDetails() {
        return "Make: " + make + ", Model: " + model + ", Color: " + color + ", Year: " + year + ", Mileage: " + mileage;
    }
}

