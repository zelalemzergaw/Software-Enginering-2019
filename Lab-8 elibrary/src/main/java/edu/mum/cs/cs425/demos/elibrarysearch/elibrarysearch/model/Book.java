package edu.mum.cs.cs425.demos.elibrarysearch.elibrarysearch.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "book")

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bokId;

    @NotBlank(message = "*ISBN number is required")
    @Column(name = "isbn")
    private String isbn;

    @NotBlank(message = "*Book tile is required")
    @Column(name = "title")
    private String title;

    private Double overDueFee;

    private String publisher;

    private LocalDate datePublished;


    public Book() {
    }

    public Integer getBokId() {
        return bokId;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Double getOverDueFee() {
        return overDueFee;
    }

    public String getPublisher() {
        return publisher;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setBokId(Integer bokId) {
        this.bokId = bokId;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOverDueFee(Double overDueFee) {
        this.overDueFee = overDueFee;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bokId=" + bokId +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", overDueFee=" + overDueFee +
                ", publisher='" + publisher + '\'' +
                ", datePublished=" + datePublished +
                '}';
    }
}
