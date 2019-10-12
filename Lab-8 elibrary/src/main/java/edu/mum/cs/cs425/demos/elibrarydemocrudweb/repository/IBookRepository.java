package edu.mum.cs.cs425.demos.elibrarydemocrudweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.demos.elibrarydemocrudweb.model.Book;

@Repository
public interface IBookRepository extends CrudRepository<Book, Integer> {

}
