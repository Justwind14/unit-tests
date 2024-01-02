package Hw4;

import java.util.HashMap;
import java.util.Map;

public class BookService implements BookRepository{
    public Map<Integer,Book>  bookList;

    public BookService() {
        this.bookList = new HashMap<>();
        bookList.put(1,new Book("testBook","testGenre",1));
    }

    @Override
    public Book getBookById(Map<Integer, Book> listOfBooks, int id) {
        if(id < 0 || id > listOfBooks.size()-1 && !listOfBooks.isEmpty()){
            return null;
        }else {
            return listOfBooks.get(id);
        }

    }
    @Override
    public String getBookBySqlRequest(String request) {
        if(request.isEmpty()){
            return null;
        }else if(request.equals("SELECT BOOK FROM BOOKS WHERE ID = 1")){
            return "testBook testBook id =123";
        }
        return "1st";
    }

}