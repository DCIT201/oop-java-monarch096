# Vehicle Rental Management System

## Overview

This is a simple **Vehicle Rental Management System** that I built to demonstrate key Object-Oriented Programming (OOP) principles. It allows customers to rent vehicles (Car, Motorcycle, Truck) and includes features like **admin login**, **vehicle availability checks**, and **rental cost calculation**.

---

## Key Features

- **Admin Login**: Admin logs in with a predefined username and password.
- **View Available Vehicles**: Customers can see which vehicles are available for rental.
- **Rent a Vehicle**: Customers select a vehicle, provide rental duration, and get the rental cost.
- **Error Handling**: The system handles invalid inputs (like non-numeric values) and provides helpful error messages.

---

## OOP Principles

- **Abstraction**: The `Vehicle` class provides the base structure for all vehicles, with abstract methods for cost calculation and availability.
- **Inheritance**: `Car`, `Motorcycle`, and `Truck` inherit from `Vehicle`, each with its specific behavior.
- **Encapsulation**: Vehicle details (like `vehicleId`, `rentalRate`) are private, and I use getters and setters to access them.
- **Polymorphism**: Methods like `calculateRentalCost` are overridden in each vehicle class.
- **Composition**: Classes like `Customer`, `RentalAgency`, and `RentalTransaction` interact to manage the rental process.

---

## Program Flow

1. **Admin Login**: The admin logs in using predefined credentials.
2. **Customer Interaction**: After logging in, the customer can:
  - View available vehicles.
  - Rent a vehicle by entering a vehicle ID and rental days.
3. **Error Handling**: The program guides users with clear error messages for invalid inputs.

---

## Example Interaction

```text
Enter Admin username:
admin
Enter Admin password:
password123
Admin Login Successful!

1. View available vehicles
2. Rent a vehicle
3. Exit
Choose an option: 2
Enter the vehicle ID you want to rent: C123
Enter rental duration in days: 5

Rental Successful! Total rental cost: 250.0
