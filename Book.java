import java.time.LocalDate;

public class Book {

    public String name;
    public String authorName;
    public double price;
    public String publisherName;
    public String genre;
    public String ISBN;
    public LocalDate dateOfPublishing;

    public Book() {
        name = "unknown";
        price = 0.0;
        authorName = "unknown";
        publisherName = "unspecified";
        genre = "uncategorised";
        ISBN = "00000000";
        dateOfPublishing = LocalDate.of(2020, 1, 1);
    }

    public Book(String n, String a, String g, double p)
            throws InvalidPriceException, InvalidGenreException {

        name = n;
        authorName = a;

        // Genre Validation
        if (g == null ||
           (!g.equalsIgnoreCase("Fiction") &&
            !g.equalsIgnoreCase("Autobiography") &&
            !g.equalsIgnoreCase("Poetry") &&
            !g.equalsIgnoreCase("Children"))) {

            throw new InvalidGenreException(
                    "Genre must be Fiction, Autobiography, Poetry or Children");
        }

        genre = g;

        // Price Validation
        if (p < 0) {
            throw new InvalidPriceException("Price cannot be negative");
        }

        price = p;
    }

    public Book(Book b) {
        name = b.name;
        authorName = b.authorName;
        price = b.price;
        publisherName = b.publisherName;
        genre = b.genre;
        ISBN = b.ISBN;
        dateOfPublishing = b.dateOfPublishing;
    }
}
