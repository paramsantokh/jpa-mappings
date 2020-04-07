package com.java.jparelationships.manyToOne.repositiry;

import com.java.jparelationships.manyToOne.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
  
}
