

import java.util.Date;

public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;
    private Date rentalDate;

    // Constructor
    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.rentalDate = new Date(); // Set current date as rental date
    }

    // Getter Methods
    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    // Rental Cost Calculation
    public double getRentalCost() {
        return vehicle.calculateRentalCost(rentalDays);
    }
}

