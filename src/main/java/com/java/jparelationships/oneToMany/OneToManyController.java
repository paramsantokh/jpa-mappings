package com.java.jparelationships.oneToMany;

import com.java.jparelationships.oneToMany.dto.CustomerRequest;
import com.java.jparelationships.oneToMany.dto.CustomerResponse;
import com.java.jparelationships.oneToMany.entity.Customer;
import com.java.jparelationships.oneToMany.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/jpa-relation/one-to-many")
public class OneToManyController {
  
  @Autowired
  private CustomerRepository customerRepository;
  
  @PostMapping ("/addCustomer")
  public List<Customer> addCustomer(@RequestBody CustomerRequest customerRequest) {
    customerRepository.save(customerRequest.getCustomer());
    return getCustomers();
  }
  
  @GetMapping ("/customers")
  public List<Customer> getCustomers() {
    List<Customer> customer = customerRepository.findAll();
    return customer;
  }
  
  @GetMapping("/pinCodes")
  private  List<CustomerResponse> getPinCodes(){
    return customerRepository.getCustomerPinCodes();
  }
}
