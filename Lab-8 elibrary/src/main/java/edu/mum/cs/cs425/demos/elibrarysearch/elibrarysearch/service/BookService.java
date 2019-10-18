package edu.mum.cs.cs425.demos.elibrarysearch.elibrarysearch.service;

import edu.mum.cs.cs425.demos.elibrarysearch.elibrarysearch.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


public interface BookService {

    public abstract Iterable<Book> getAllBooks();
    public abstract Page<Book> getAllBooksPaged(int pageNo);
    public abstract Book saveBook(Book book);
    public abstract Book getBookById(Integer bookId);
    public abstract void deleteBookById(Integer bookId);
    Page<Book> search(String search, int pageno);


}
