package laba1.classes.task12_14_15.main;

import laba1.classes.task12_14_15.util.Book;

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

        // Check override methods
        System.out.println(mathBook);
        System.out.println(mathBook.hashCode());
        System.out.println(mathBook.equals(historyBook));
        System.out.println(mathBook.clone());

        // Create new book collection
        TreeSet<Book> books = new TreeSet<Book>();
        books.add(historyBook);
        books.add(mathBook);

        // Check compareTo() method
        System.out.println(books);
    }
}
