import java.util.Arrays;

class CustomerOrder {
    String customerId;
    String orderDate;
    String[] specifications;

    public CustomerOrder(String customerId, String orderDate, String[] specifications) {
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.specifications = specifications;
    }

    public static void main(String[] args) {
        // Example data for three customer orders denoting Type of shaped charge, depth of perforation, and borehole diameter
        String[] specs1 = {"Type A", "Depth 300m", "Diameter 10cm"};
        String[] specs2 = {"Type B", "Depth 450m", "Diameter 15cm"};
        String[] specs3 = {"Type C", "Depth 200m", "Diameter 8cm"};

        // Creating an array to store the customer orders
        CustomerOrder[] orders = new CustomerOrder[3];
        orders[0] = new CustomerOrder("Cust001", "2024-03-14", specs1);
        orders[1] = new CustomerOrder("Cust002", "2024-03-15", specs2);
        orders[2] = new CustomerOrder("Cust003", "2024-03-16", specs3);

        // Displaying the stored data
        for (CustomerOrder order : orders) {
            System.out.println("Customer ID: " + order.customerId + ", Order Date: " + order.orderDate + ", Specifications: " + Arrays.toString(order.specifications));

        }
    }
}