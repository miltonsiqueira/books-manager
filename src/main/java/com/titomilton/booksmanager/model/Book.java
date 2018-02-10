package com.titomilton.booksmanager.model;


import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
//    private Author author;

    public Book() {
    }
//
//    public Book(Long id, String title, Author author) {
//        this.id = id;
//        this.title = title;
//        this.author = author;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    @ManyToOne
//    @JoinColumn(name = "author_id")
//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }
}
