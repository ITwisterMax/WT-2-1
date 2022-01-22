package laba1.classes.task12_14_15.util;

/**
 * Class Book
 */
public class Book implements Cloneable, Comparable<Book>
{
    /**
     * Book title
     */
    private String title;

    /**
     * Book author
     */
    private String author;

    /**
     * Book price
     */
    private int price;

    /**
     * Edition
     */
    private static int edition;

    /**
     * Isbn
     */
    private int isbn;

    /**
     * @param title - book title
     * @param author - book author
     * @param price - book price
     * @param isbn - isbn
     */
    public Book(String title, String author, int price, int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    /**
     * Get title
     *
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get author
     *
     * @return String
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Get price
     *
     * @return int
     */
    public int getPrice() {
        return price;
    }

    /**
     * Get string info about class
     *
     * @return String
     */
    @Override
    public String toString(){
        return "Title: " + title + ", Author: " + author + ", Price: " + price + ", Isbn: " + isbn;
    }

    /**
     * Get hash code
     *
     * @return int
     */
    @Override
    public int hashCode(){
        return title.hashCode() + author.hashCode();
    }

    /**
     * Compare two objects
     *
     * @param object - current object
     * @return boolean
     */
    @Override
    public boolean equals(Object object){
        if (object == this) {
            return true;
        }
        if (!(object instanceof Book book)) {
            return false;
        }

        return (title.equals(book.title) && author.equals(book.author));
    }

    /**
     * Clone current book
     *
     * @return object
     */
    @Override
    public Object clone()
    {
        return new Book("Clone " + title, author, price, isbn);
    }

    /**
     * Compare two books by isbn
     *
     * @param book - current book
     * @return int
     */
    @Override
    public int compareTo(Book book) {
        return (isbn - book.isbn > 0) ? 1 : -1;
    }
}
