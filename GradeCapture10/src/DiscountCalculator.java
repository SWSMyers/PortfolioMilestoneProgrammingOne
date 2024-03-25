public class DiscountCalculator {

    public static void main(String[] args) {
        // Example usage of the calculateDiscount method
        double originalPrice = 100.0; // Original price of the item
        double discountRate = 0.2; // Discount rate (20%)

        // Call the calculateDiscount method and store the result
        double discountedPrice = calculateDiscount(originalPrice, discountRate);

        // Print out the discounted price
        System.out.println("The discounted price is: $" + discountedPrice);
    }

    public static double calculateDiscount(double price, double discountRate) {
        return price * (1 - discountRate);
    }
}
