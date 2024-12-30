

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testCarRentalCost() {
        Car car = new Car("C123", 50, "SUV");
        double rentalCost = car.calculateRentalCost(5); // 5 days
        assertEquals(350, rentalCost, "The rental cost for 5 days should be 350");
    }

    @Test
    public void testMotorcycleRentalCost() {
        Motorcycle motorcycle = new Motorcycle("M456", 30, true); // With sidecar
        double rentalCost = motorcycle.calculateRentalCost(3); // 3 days
        assertEquals(110, rentalCost, "The rental cost for 3 days should be 110");
    }

    @Test
    public void testTruckRentalCost() {
        Truck truck = new Truck("T789", 80, 6); // Truck with high load capacity
        double rentalCost = truck.calculateRentalCost(7); // 7 days
        assertEquals(740, rentalCost, "The rental cost for 7 days should be 740");
    }
}
