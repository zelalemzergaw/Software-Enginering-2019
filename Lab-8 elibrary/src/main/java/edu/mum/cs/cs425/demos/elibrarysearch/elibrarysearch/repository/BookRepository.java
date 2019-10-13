package edu.mum.cs.cs425.demos.elibrarysearch.elibrarysearch.repository;

import edu.mum.cs.cs425.demos.elibrarysearch.elibrarysearch.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    Page<Book> findBooksByTitleContainsOrIsbnContainsOrPublisherContains(String title, String isbn, String publisher, Pageable pageRequest);
}
