public class MainVehicle {   // Main class

    public static void main(String[] args) {   // Program execution starts here

        // Creating objects
        Vehicle v1 = new Vehicle();   // Default constructor object
        Vehicle v2 = new Vehicle("Honda", "City", 1800000, 45, 540);  // Parameterized object
        Vehicle v3 = new Vehicle("Hyundai", "i20", 1200000, 35, 420); // Parameterized object

        Vehicle v4 = new Vehicle(v2);  // Copy constructor object

        // Creating array of vehicles
        Vehicle[] vehicles = {v1, v2, v3, v4};  // Stores multiple vehicles

        System.out.println("--------------------------------------------------------"); // Table line
        System.out.printf("%-15s %-15s %-12s %-10s%n",
                "Brand", "Model", "Price", "Mileage"); // Table header
        System.out.println("--------------------------------------------------------"); // Table line

        // Loop to print vehicle details
        for (Vehicle v : vehicles) {   // Iterates through vehicle array
            System.out.printf("%-15s %-15s %-12.2f %-10.2f%n",
                    v.brandName,      // Prints brand
                    v.modelName,      // Prints model
                    v.price,          // Prints price
                    v.calcMileage()); // Prints mileage
        }

        System.out.println("--------------------------------------------------------"); // Table line
    }
}
