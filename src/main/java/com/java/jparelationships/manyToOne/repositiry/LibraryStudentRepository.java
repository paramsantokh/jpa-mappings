package com.java.jparelationships.manyToOne.repositiry;

import com.java.jparelationships.manyToOne.LibraryStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryStudentRepository extends JpaRepository<LibraryStudent, Long> {
  
}
