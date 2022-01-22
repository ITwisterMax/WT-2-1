package laba1.classes.task16.main;

import laba1.classes.task12_14_15.util.Book;
import laba1.classes.task16.util.BookComparator;

import java.util.TreeSet;

/**
 * Class Main
 */
public class Main {
    /**
     * Main function
     *
     * @param args - arguments
     */
    public static void main(String[] args) {
        // Create new book objects
        Book mathBook = new Book("Math", "Maksim Mikhalkov 1", 30, 1);
        Book historyBook = new Book("History", "Maksim Mikhalkov 2", 20, 2);

        // Create new book collection
        TreeSet<Book> books = new TreeSet<Book>(BookComparator.byTitle);
        books.add(historyBook);
        books.add(mathBook);

        // Check compare by Title
        System.out.println(books);
    }
}
