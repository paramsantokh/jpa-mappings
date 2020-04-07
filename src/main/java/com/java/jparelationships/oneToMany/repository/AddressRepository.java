package com.java.jparelationships.oneToMany.repository;

import com.java.jparelationships.oneToMany.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
  
}
