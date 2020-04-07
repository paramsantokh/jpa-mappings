package com.java.jparelationships.oneToOne.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * one student can have one library card
 */
@Entity
@Table (name = "library")
public class Library {
  
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String title;
  private String issueDate;
  
  @JsonManagedReference
  @OneToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Student student;
  
  public Library() {
  }
  
  public Library(String title, String issueDate, Student student) {
    this.title = title;
    this.issueDate = issueDate;
    this.student = student;
  }
  
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
  
  public String getIssueDate() {
    return issueDate;
  }
  
  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }
  
  public Student getStudent() {
    return student;
  }
  
  public void setStudent(Student student) {
    this.student = student;
  }
}
