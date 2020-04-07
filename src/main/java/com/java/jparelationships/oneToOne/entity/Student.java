package com.java.jparelationships.oneToOne.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "student")
public class Student {
  
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String name;
  
  @JsonBackReference
  @OneToOne (mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Library library;
  
  public Student() {
  }
  
  public Student(String name, Library library) {
    this.name = name;
    this.library = library;
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
  
  public Library getLibrary() {
    return library;
  }
  
  public void setLibrary(Library library) {
    this.library = library;
  }
}

