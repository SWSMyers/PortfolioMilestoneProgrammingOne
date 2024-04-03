import java.lang.String;

public class HondaPilot2014 {
    private String color;
    private double mileage;
    private boolean engineOn;

    // Constructor to initialize a HondaPilot2014 object
    public HondaPilot2014(String color, double mileage) {
        this.color = color;
        this.mileage = mileage;
        this.engineOn = false; // Engine is off by default
    }

    // Method to start the engine
    public void startEngine() {
        // Pseudocode:
        // If engine is off,
        // turn it on.
        if (!engineOn) {
            engineOn = true;
        }
    }

    // Method to stop the engine
    public void stopEngine() {
        // Pseudocode:
        // If engine is on,
        // turn it off.
        if (engineOn) {
            engineOn = false;
        }
    }

    // Method to drive a certain distance, increasing mileage
    public void drive(double distance) {
        // Pseudocode:
        // If engine is on and distance is positive,
        // add distance to mileage.
        if (engineOn && distance > 0) {
            mileage += distance;
        }
    }

    // Method to get the current mileage
    public double getMileage() {
        // Pseudocode:
        // Return the current mileage.
        return mileage;
    }

    // Method to display information about the Honda Pilot
    public void displayInfo() {
        // Pseudocode:
        // Print the color, mileage, and engine status of the Honda Pilot.
        String engineStatus = engineOn ? "On" : "Off";
        System.out.println("Color: " + color + " Mileage: " + mileage + " Engine: " + engineStatus);
    }
    //Include methods to add/remove/update

    //Method to update the color of the Honda Pilot
    public void updateColor(string newColor) {
        this.color = newColor;
    }

    //Method to reset the mileage for testing purposes or engine replacement
    public void resetMileage()  {
        this.mileage = 0;
    }

    //Method to update mileage manually with a check to ensure behavioral integrity
    public void updateMileage(double newMileage)  {
        if (newMileage >=0) {
            this.mileage = newMileage;
        }
    }
}