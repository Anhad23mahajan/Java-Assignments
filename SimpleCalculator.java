// Import Scanner class to take input from user
import java.util.Scanner;

// Main class containing the program execution
public class SimpleCalculator {

    // Main method where program starts
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Create object of Operations class to use its methods
        Operations op = new Operations();

        // Variable to store user's menu choice
        int choice;

        // Ask user for first number (ONLY ONCE)
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt(); // Store first number

        // Ask user for second number (ONLY ONCE)
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt(); // Store second number

        // Menu loop runs until user chooses to exit
        do {

            // Display calculator menu
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");

            // Ask user to choose an operation
            System.out.print("Enter your choice: ");
            choice = sc.nextInt(); // Read user's choice

            // Switch statement to perform selected operation
            switch (choice) {

                case 1:
                    // Call add method and display result
                    System.out.println("Result: " + op.add(n1, n2));
                    break;

                case 2:
                    // Call subtract method and display result
                    System.out.println("Result: " + op.subtract(n1, n2));
                    break;

                case 3:
                    // Call multiply method and display result
                    System.out.println("Result: " + op.multiply(n1, n2));
                    break;

                case 4:
                    // Call divide method and display result
                    System.out.println("Result: " + op.divide(n1, n2));
                    break;

                case 5:
                    // Call modulus method and display result
                    System.out.println("Result: " + op.modulus(n1, n2));
                    break;

                case 6:
                    // Exit message when user chooses 0
                    System.out.println("Program ended");
                    break;

                default:
                    // Message for invalid menu choice
                    System.out.println("Invalid choice");
            }

        } while (choice != 6); // Loop continues until user enters 0

        // Close Scanner to free resources
        sc.close();
    }
}
