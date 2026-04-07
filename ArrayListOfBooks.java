import java.util.ArrayList;

public class ArrayListOfBooks {

    public static void main(String args[]) {

        ArrayList<Book> bList = new ArrayList<>();

        // -------- VALID TEST CASES --------
        try {
            Book b1 = new Book("Harry Potter", "J.K Rowling", "Children", 500);
            bList.add(b1);
        }
        catch (InvalidGenreException e) {
            System.out.println("Genre Error: " + e.getMessage());
        }
        catch (InvalidPriceException e) {
            System.out.println("Price Error: " + e.getMessage());
        }

        try {
            Book b2 = new Book("The Alchemist", "Paulo Coelho", "Fiction", 300);
            bList.add(b2);
        }
        catch (InvalidGenreException e) {
            System.out.println("Genre Error: " + e.getMessage());
        }
        catch (InvalidPriceException e) {
            System.out.println("Price Error: " + e.getMessage());
        }

        // -------- INVALID GENRE TEST CASE --------
        try {
            Book b3 = new Book("Unknown Book", "Unknown", "SciFi", 400);
            bList.add(b3);
        }
        catch (InvalidGenreException e) {
            System.out.println("Genre Error: " + e.getMessage());
        }
        catch (InvalidPriceException e) {
            System.out.println("Price Error: " + e.getMessage());
        }

        // -------- INVALID PRICE TEST CASE --------
        try {
            Book b4 = new Book("Cheap Book", "No Author", "Poetry", -200);
            bList.add(b4);
        }
        catch (InvalidGenreException e) {
            System.out.println("Genre Error: " + e.getMessage());
        }
        catch (InvalidPriceException e) {
            System.out.println("Price Error: " + e.getMessage());
        }

        // -------- PRINT ALL VALID BOOKS --------
        System.out.println("\n--- VALID BOOKS ---");
        bList.forEach(b -> {
            System.out.println("Name: " + b.name);
            System.out.println("Genre: " + b.genre);
            System.out.println("Price: " + b.price);
            System.out.println("-------------------");
        });

        // -------- AVERAGE PRICE --------
        double total = 0;

        for (Book b : bList) {
            total += b.price;
        }

        if (bList.size() > 0) {
            double average = total / bList.size();
            System.out.println("\nAverage Price of Books: " + average);
        }

        // -------- BOOKS OF PARTICULAR GENRE (Children) --------
        System.out.println("\n--- Books in Genre: Children ---");

        bList.forEach(b -> {
            if (b.genre.equalsIgnoreCase("Children")) {
                System.out.println(b.name + " by " + b.authorName);
            }
        });
    }
}
