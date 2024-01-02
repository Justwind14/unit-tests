package Hw4;

import java.util.Map;

public interface BookRepository {
    public Book getBookById(Map<Integer, Book> listOfBooks,int id);
    public String getBookBySqlRequest(String request);

}