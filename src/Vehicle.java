

public abstract class Vehicle {
    private String vehicleId;
    private boolean availableForRental;
    private double baseRentalRate;

    // Constructor
    public Vehicle(String vehicleId, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.baseRentalRate = baseRentalRate;
        this.availableForRental = true; // Default availability
    }

    // Abstract Methods
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();

    // Getter and Setter Methods
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public boolean isAvailable() {
        return availableForRental;
    }

    public void setAvailable(boolean availableForRental) {
        this.availableForRental = availableForRental;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }
}
