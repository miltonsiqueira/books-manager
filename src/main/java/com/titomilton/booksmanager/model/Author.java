package com.titomilton.booksmanager.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    private Long id;

    private String firstName;
    private String lastName;

//    private Set<Book> books =  new HashSet<>();


    public Author() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
//    public Set<Book> getBooks() {
//        return books;
//    }
//
//    public void setBooks(Set<Book> books) {
//        this.books = books;
//    }
}
