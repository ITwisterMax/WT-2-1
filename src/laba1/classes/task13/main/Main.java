package laba1.classes.task13.main;

import laba1.classes.task12_14_15.util.Book;
import laba1.classes.task13.util.ProgrammerBook;

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
        // Create new programmer book objects
        ProgrammerBook javaBook = new ProgrammerBook("Java", "Maksim Mikhalkov 1",
                30, 1, "Java", 1);
        ProgrammerBook phpBook = new ProgrammerBook("PHP", "Maksim Mikhalkov 1",
                50, 2, "PHP", 2);

        // Check override methods
        System.out.println(javaBook);
        System.out.println(javaBook.hashCode());
        System.out.println(javaBook.equals(phpBook));
    }
}
