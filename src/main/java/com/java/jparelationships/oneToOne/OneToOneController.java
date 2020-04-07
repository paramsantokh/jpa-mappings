package com.java.jparelationships.oneToOne;

import com.java.jparelationships.oneToOne.entity.Library;
import com.java.jparelationships.oneToOne.entity.Student;
import com.java.jparelationships.oneToOne.repositiry.LibraryRepository;
import com.java.jparelationships.oneToOne.repositiry.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/jpa-relation/one-to-one")
public class OneToOneController {
  
  @Autowired
  private LibraryRepository libraryRepository;
  
  @Autowired
  private StudentRepository studentRepository;
  
  @PostMapping ("/addLibraryData")
  public List<Library> addBookDetail(@RequestBody LibraryRequest libraryRequest) {
    libraryRepository.save(libraryRequest.getLibrary());
    return getLibraryDetail();
  }
  
  @GetMapping ("/library")
  public List<Library> getLibraryDetail() {
    List<Library> libraries = libraryRepository.findAll();
    return libraries;
  }
  
  @GetMapping ("/students")
  public List<Student> getStudents() {
    List<Student> students = studentRepository.findAll();
    return students;
  }
}
