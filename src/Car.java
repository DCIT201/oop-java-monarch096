

public class Car extends Vehicle {

    private String carType; // Sedan, SUV, etc.

    // Constructor
    public Car(String vehicleId, double baseRentalRate, String carType) {
        super(vehicleId, baseRentalRate);
        this.carType = carType;
    }

    public Car(String c1, String toyotaCorolla, double v) {
    }

    @Override
    public double calculateRentalCost(int days) {
        double totalCost = getBaseRentalRate() * days;
        if ("SUV".equals(carType)) {
            totalCost += 50; // Additional charge for SUVs
        }
        return totalCost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
