package Hw4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;




public class TestBookService {
    BookService bookService;
    Book book = new Book("test11","test23",2);
    Book book2 = new Book("test11","test23",3);
    @BeforeEach
    void testInit(){
        bookService = new BookService();
        bookService.bookList.put(1,book);
        bookService.bookList.put(2,book2);

    }

    /**
     * Тест для проверки извлечения по Id книги.
     * Добавили один обьект в bookService и проверили соответсвует ли возращенный обьект.
     */
    @Test
    void testGetBookById(){
        assertEquals(book,bookService.getBookById(bookService.bookList,1));
    }


    /**
     * Проверяем на то, что при передаче не валидных данных нам возвращается NULL
     * @param i - запредельные значения.
     */
    @ParameterizedTest
    @ValueSource(ints = {-1,100,})
    void testGetBookByIdIncorrectValues(int i){
        assertEquals(null,bookService.getBookById(bookService.bookList,i));
    }

    /**
     * Проверка путем отправления строки получения нужного нам ответа, имитация запроса к SQL
     */
    @Test
    void testGetBookBySqlRequest(){
        BookService bookService1 = mock(BookService.class);
        when(bookService1.getBookBySqlRequest(anyString())).thenReturn("testBook testBook id =123").thenReturn("1st").thenReturn(null);
        String expected1stResult = "1st";
        String expectedNullResult = null;
        String expectedResult = "testBook testBook id =123";

        String result = bookService1.getBookBySqlRequest("SELECT BOOK FROM BOOKS WHERE ID = 1");
        String someStringResult = bookService1.getBookBySqlRequest("some String");
        String nullString = bookService1.getBookBySqlRequest("");

        assertEquals(expected1stResult, someStringResult);
        assertEquals(expectedNullResult, nullString);
        assertEquals(expectedResult, result);

    }
}
