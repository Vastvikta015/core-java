package ajp_java;

import java.util.ArrayList;

public class BookCollection {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        // Create book objects and add them to the ArrayList
        books.add(new Book(1, "Computer Networks", "A.S Tanenbaum"));
        books.add(new Book(2, "Artificial Intelligence", "Elaine Rich"));
        books.add(new Book(3, "Java", "Joshua Bloch"));

        // Display book details using an enhanced for loop
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}
