package Hw4;

public class Book {
    private String nameBook;
    private String bookGenre;
    private int id;

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book(String nameBook, String bookGenre, int id) {
        this.nameBook = nameBook;
        this.bookGenre = bookGenre;
        this.id = id;
    }
}
