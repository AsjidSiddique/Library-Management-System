package AdminLogic;

import java.util.LinkedList;

public class BookManager {

    private static LinkedList<Book> bookList = new LinkedList<>();
    private BookManager() {}

    public static LinkedList<Book> getBookList() {
        return bookList;
    }

    public static void addBook(Book book) {
        bookList.add(book);
    }

    public static Book findBookByIsbn(String isbn) {
        for (Book b : bookList) {
            if (b.getIsbn().equalsIgnoreCase(isbn)) {
                return b;
            }
        }
        return null;
    }

    public static boolean removeBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            bookList.remove(book);
            return true;
        }
        return false;
    }

    public static boolean borrowBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            return book.borrowCopy(); 
        }
        return false;
    }

    public static void returnBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            book.returnCopy();
        }
    }

    
}