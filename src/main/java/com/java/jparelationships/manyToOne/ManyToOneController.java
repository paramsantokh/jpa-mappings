package com.java.jparelationships.manyToOne;

import com.java.jparelationships.manyToOne.repositiry.BookRepository;
import com.java.jparelationships.manyToOne.repositiry.LibraryStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/jpa-relation/many-to-one")
public class ManyToOneController {
  
  @Autowired
  private LibraryStudentRepository libraryStudentRepository;
  
  @Autowired
  private BookRepository bookRepository;
  
  @PostMapping ("/addCustomer")
  public List<LibraryStudent> addStudent(@RequestBody LibraryStudent libraryStudent) {
    libraryStudentRepository.save(libraryStudent);
    return getStudents();
  }
  
  @GetMapping ("/student")
  public List<LibraryStudent> getStudents() {
    List<LibraryStudent> libraryStudents = libraryStudentRepository.findAll();
    return libraryStudents;
  }
  
  @GetMapping("/books")
  private  List<Book> getPinCodes(){
    return bookRepository.findAll();
  }
}
