

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String customerId;
    private List<RentalTransaction> rentalHistory;

    // Constructor
    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.rentalHistory = new ArrayList<>();
    }

    public Customer(String customerName) {
    }

    // Method to add rental transaction
    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }
}

