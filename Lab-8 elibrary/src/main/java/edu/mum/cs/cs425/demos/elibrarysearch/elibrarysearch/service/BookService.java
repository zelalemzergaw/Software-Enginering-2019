package edu.mum.cs.cs425.demos.elibrarysearch.elibrarysearch.service;

import edu.mum.cs.cs425.demos.elibrarysearch.elibrarysearch.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


public interface BookService {

    public  abstract Iterable<Book> getAllBooks();
    public abstract Page<Book> getAllBooksPage(int pageNo);
    public abstract  Book saveBooK(Book book);
    public abstract Book getBookById(Integer bookId);
    public abstract void deleteBooksById(Integer bookId);
    Page<Book> search(String search,int pageNo);


}
