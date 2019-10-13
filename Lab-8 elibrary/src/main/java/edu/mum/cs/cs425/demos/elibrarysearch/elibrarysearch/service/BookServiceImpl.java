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
    public BookRepository bookRepository;

    @Override
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll(Sort.by("title"));
    }

    @Override
    public Page<Book> getAllBooksPage(int pageNo) {
        return bookRepository.findAll(PageRequest.of(pageNo,3,Sort.by("title")));
    }

    @Override
    public Book saveBooK(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Integer bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }

    @Override
    public void deleteBooksById(Integer bookId) {
    bookRepository.deleteById(bookId);
    }

    @Override
    public Page<Book> search(String search, int pageNo) {
   Page<Book> students=bookRepository.findBooksByTitleContainsOrIsbnContainsOrPublisherContains
                (search,search,search, (Pageable) PageRequest.of(pageNo,3, Sort.by("title")));
        return students;
    }
}
