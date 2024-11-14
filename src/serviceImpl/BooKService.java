package serviceImpl;

import database.Database;
import models.Book;
import models.Library;
import service.BookService;

import java.util.List;

public class BooKService implements BookService {
    @Override
    public Book saveBook(Long libraryId, Book book) {
        Database.books.add(book);

        return book;
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        return Database.books;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (Library library:Database.libraries){
            if (library.getId()==libraryId){
                System.out.println(libraryId);
            }
            for (Book book : Database.books){
                if(book.getId()==bookId){
                    System.out.println(bookId);
                }
            }
        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        Book library = getBookById(libraryId,bookId);
        Database.books.remove(bookId);

        return "Success! Delete book";
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        Library books = (Library) getAllBooks(libraryId);
        Database.books.clear();

    }
}
