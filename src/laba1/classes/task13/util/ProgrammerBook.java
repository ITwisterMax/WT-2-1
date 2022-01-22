package laba1.classes.task13.util;

import laba1.classes.task12_14_15.util.Book;

/**
 * Class ProgrammerBook
 */
public class ProgrammerBook extends Book {
    /**
     * Language
     */
    private String language;

    /**
     * Level
     */
    private int level;

    /**
     * @param title - book title
     * @param author - book author
     * @param price - book price
     * @param isbn - isbn
     * @param language - language
     * @param level - level
     */
    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    /**
     * Get string info about class
     *
     * @return String
     */
    @Override
    public String toString(){
        return super.toString() + ", Language: " + language + ", Level: " + level;
    }

    /**
     * Get hash code
     *
     * @return int
     */
    @Override
    public int hashCode(){
        return super.hashCode() * language.hashCode();
    }

    /**
     * Compare two objects
     *
     * @param object - current object
     * @return boolean
     */
    @Override
    public boolean equals(Object object){
        ProgrammerBook pBook = (ProgrammerBook)object;
        return (super.equals(pBook) && language.equals(pBook.language) && level == pBook.level);
    }
}
