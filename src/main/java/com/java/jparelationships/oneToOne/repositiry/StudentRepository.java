package com.java.jparelationships.oneToOne.repositiry;

import com.java.jparelationships.oneToOne.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
  
}
