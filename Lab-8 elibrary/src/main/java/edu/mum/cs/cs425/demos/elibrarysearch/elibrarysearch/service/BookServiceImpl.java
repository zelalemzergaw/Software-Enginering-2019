package edu.mum.cs.cs425.demos.elibrarysearch.elibrarysearch.service;

import edu.mum.cs.cs425.demos.elibrarysearch.elibrarysearch.model.Book;
import edu.mum.cs.cs425.demos.elibrarysearch.elibrarysearch.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository repository;

    @Override
    public Iterable<Book> getAllBooks() {
        return repository.findAll(Sort.by("title"));
    }

    @Override
    public Page<Book> getAllBooksPaged(int pageNo) {
        return repository.findAll(PageRequest.of(pageNo, 3, Sort.by("title")));
    }

    @Override
    public Book saveBook(Book book) {
        return repository.save(book);
    }

    @Override
    public Book getBookById(Integer bookId) {
        return repository.findById(bookId).orElse(null);
    }

    @Override
    public void deleteBookById(Integer bookId) {
        repository.deleteById(bookId);
    }

    @Override
    public Page<Book> search(String search,int pageNo) {
        Page<Book> students  =repository.findBooksByTitleContainsOrIsbnContainsOrPublisherContains
                (search,search,search, PageRequest.of(pageNo, 3, Sort.by("title")));
        return students;
    }
}
