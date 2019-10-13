package edu.mum.cs.cs425.demos.elibrarysearch.elibrarysearch.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "book")
public class Book {

    private Integer bokId;

    private String isbn;

    private String title;

    private Double overDueFee;

    private String publisher;

    private LocalDate datePublished;

}
