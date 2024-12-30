

public class Truck extends Vehicle {

    private double loadCapacity; // in tons

    // Constructor
    public Truck(String vehicleId, double baseRentalRate, double loadCapacity) {
        super(vehicleId, baseRentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        double totalCost = getBaseRentalRate() * days;
        if (loadCapacity > 5) {
            totalCost += 100; // Additional charge for trucks with high capacity
        }
        return totalCost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
