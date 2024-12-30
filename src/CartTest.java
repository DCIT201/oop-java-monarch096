

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    public void testCarRentalCost() {
        Car car = new Car("C123", 50, "SUV");
        double rentalCost = car.calculateRentalCost(5); // 5 days
        assertEquals(350, rentalCost, "The rental cost for 5 days should be 350");
    }

    @Test
    public void testCarAvailability() {
        Car car = new Car("C124", 60, "Sedan");
        assertTrue(car.isAvailableForRental(), "The car should be available for rental initially");

        car.setAvailable(false); // Mark as rented
        assertFalse(car.isAvailableForRental(), "The car should not be available for rental after being rented");
    }
}
