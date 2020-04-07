package com.java.jparelationships.oneToMany.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * A customer can have multiple Addresses(ONE TO MANY)
 */
@Entity
public class Customer {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private int customerId;
  
  private String name;
  
  @JsonManagedReference
  @OneToMany (targetEntity = Address.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  //@JoinColumn (name="customer_id", referencedColumnName = "customerId")
  private List<Address> addresses;
  
  public Customer() {
  }
  
  public Customer(String name, List<Address> addresses) {
    this.name = name;
    this.addresses = addresses;
  }
  
  public int getCustomerId() {
    return customerId;
  }
  
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public List<Address> getAddresses() {
    return addresses;
  }
  
  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }
}
