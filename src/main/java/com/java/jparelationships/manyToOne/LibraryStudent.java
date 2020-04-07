package com.java.jparelationships.manyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Multiple students can be issued same book
 */
@Entity
public class LibraryStudent {
  @Id
  @GeneratedValue
  private long id;
  private String name;
  
  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private Book book;
  
  public LibraryStudent(){
  }
  
  public LibraryStudent(String name, Book book) {
    this.name = name;
    this.book = book;
  }
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Book getBook() {
    return book;
  }
  
  public void setBook(Book book) {
    this.book = book;
  }
}
