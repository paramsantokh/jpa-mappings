package com.java.jparelationships.oneToMany.repository;

import com.java.jparelationships.oneToMany.dto.CustomerResponse;
import com.java.jparelationships.oneToMany.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {
 
  @Query("select new com.java.jparelationships.oneToMany.dto.CustomerResponse(c.name, a.city) from Customer c JOIN c.addresses a")
  public List<CustomerResponse> getCustomerPinCodes();
  
}
