

import java.util.List;

public class RentalAgency {

    public List<Vehicle> vehicles;

    public RentalAgency(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // Rent vehicle method
    public RentalTransaction rentVehicle(Customer customer, Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.setAvailable(false); // Mark as rented
            RentalTransaction transaction = new RentalTransaction(vehicle, customer, days);
            customer.addRentalTransaction(transaction);
            return transaction;
        }
        return null; // Vehicle is not available
    }

    // Return vehicle method
    public void returnVehicle(Vehicle vehicle) {
        // Mark as available for rental
        vehicle.setAvailable(true);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = List.of(vehicles);
    }
}
