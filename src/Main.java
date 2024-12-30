

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a list of vehicles for rental
        Vehicle car = new Car("C123", 50, "SUV");
        Vehicle motorcycle = new Motorcycle("M456", 30, true); // Motorcycle with sidecar
        Vehicle truck = new Truck("T789", 80, 6); // Truck with high load capacity

        // Create a RentalAgency and add vehicles to it
        RentalAgency rentalAgency = new RentalAgency(java.util.Arrays.asList(car, motorcycle, truck));

        // Create a sample customer
        Customer customer = new Customer("John Doe", "C001");

        Scanner scanner = new Scanner(System.in);

        // Admin Login
        System.out.println("Enter Admin username:");
        String adminUsername = scanner.nextLine();
        System.out.println("Enter Admin password:");
        String adminPassword = scanner.nextLine();

        if (adminLogin(adminUsername, adminPassword)) {
            System.out.println("Admin Login Successful!");
            boolean exitProgram = false;

            while (!exitProgram) {
                // Display options for customers to rent a vehicle
                System.out.println("\nCustomer Rental System:");
                System.out.println("1. View available vehicles");
                System.out.println("2. Rent a vehicle");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume the newline

                switch (choice) {
                    case 1:
                        // Show available vehicles
                        System.out.println("\nAvailable Vehicles for Rent:");
                        for (Vehicle vehicle : rentalAgency.getVehicles()) {
                            if (vehicle.isAvailableForRental()) {
                                System.out.println("Vehicle ID: " + vehicle.getVehicleId() + " | Type: " + vehicle.getClass().getSimpleName());
                            }
                        }
                        break;

                    case 2: 
                        // Rent a vehicle
                        System.out.print("Enter the vehicle ID you want to rent: ");
                        String vehicleId = scanner.nextLine();
                        Vehicle selectedVehicle = null;

                        for (Vehicle vehicle : rentalAgency.getVehicles()) {
                            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                                selectedVehicle = vehicle;
                                break;
                            }
                        }

                        if (selectedVehicle != null) {
                            System.out.print("Enter rental duration in days: ");
                            int rentalDays = scanner.nextInt();

                            // Rent the selected vehicle
                            RentalTransaction transaction = rentalAgency.rentVehicle(customer, selectedVehicle, rentalDays);

                            if (transaction != null) {
                                System.out.println("\nRental Successful! Total rental cost: " + transaction.getRentalCost());
                            } else {
                                System.out.println("The vehicle is not available for rental.");
                            }
                        } else {
                            System.out.println("Vehicle not found or not available.");
                        }
                        break;

                    case 3:
                        // Exit the program
                        System.out.println("Exiting the system.");
                        exitProgram = true;
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        } else {
            System.out.println("Invalid Admin login credentials.");
        }

        scanner.close();
    }

    // Admin login logic
    private static boolean adminLogin(String username, String password) {
        // In a real-world scenario, use hashed passwords and proper validation
        return "admin".equals(username) && "password123".equals(password);
    }
}
