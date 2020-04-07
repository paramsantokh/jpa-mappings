package com.java.jparelationships.manyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * one book can be issued to many students
 */
@Entity
public class Book {
  @Id
  private long id;
  private String title;
  
  public Book() {
  }
  
  public Book(String title) {
    this.title = title;
    
  }
  
  public long getId() {
    return id;
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
}
