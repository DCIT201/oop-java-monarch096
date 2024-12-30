

public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String vehicleId, double baseRentalRate, boolean hasSidecar) {
        super(vehicleId, baseRentalRate);
        this.hasSidecar = hasSidecar;
    }

    public Motorcycle(String m1, String yamahaR1, double v) {
        super();
    }

    @Override
    public double calculateRentalCost(int days) {
        double totalCost = getBaseRentalRate() * days;
        if (hasSidecar) {
            totalCost += 20; // Additional cost for motorcycles with sidecars
        }
        return totalCost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
