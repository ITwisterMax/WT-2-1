package laba1.classes.task16.util;

import laba1.classes.task12_14_15.util.Book;

import java.util.Comparator;

/**
 * Class BookComparator
 */
public class BookComparator {
    /**
     * Compare by title
     */
    public static Comparator<Book> byTitle = (book1, book2) ->
            book1.getTitle().compareToIgnoreCase(book2.getTitle());

    /**
     * Compare by author
     */
    public static Comparator<Book> byAuthor = (book1, book2) ->
            book1.getAuthor().compareToIgnoreCase(book2.getAuthor());

    /**
     * Compare by price
     */
    public static Comparator<Book> byPrice = Comparator.comparingInt(Book::getPrice);

    /**
     * Compare by title then by author
     */
    public static Comparator<Book> byTitleAuthor = byTitle.thenComparing(byAuthor);

    /**
     * Compare by author then by title
     */
    public static Comparator<Book> byAuthorTitle = byAuthor.thenComparing(byTitle);

    /**
     * Compare by author then by title then by price
     */
    public static Comparator<Book> byAuthorTitlePrice = byAuthor.thenComparing(byTitle).thenComparing(byPrice);
}