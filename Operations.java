// This class contains methods to perform arithmetic operations
public class Operations {

    // Method to add two numbers
    int add(int a, int b) {
        return a + b; // Returns the sum of a and b
    }

    // Method to subtract second number from first
    int subtract(int a, int b) {
        return a - b; // Returns the difference
    }

    // Method to multiply two numbers
    int multiply(int a, int b) {
        return a * b; // Returns the product
    }

    // Method to divide two numbers
    double divide(int a, int b) {

        // Check to avoid division by zero
        if (b == 0) {
            System.out.println("Cannot divide by zero"); // Error message
            return 0; // Return 0 to avoid program crash
        }

        // Perform division and return result
        return (double) a / b;
    }

    // Method to find modulus (remainder)
    int modulus(int a, int b) {

        // Check to avoid modulus by zero
        if (b == 0) {
            System.out.println("Cannot perform modulus by zero"); // Error message
            return 0; // Return 0 safely
        }

        // Return remainder
        return a % b;
    }
}
