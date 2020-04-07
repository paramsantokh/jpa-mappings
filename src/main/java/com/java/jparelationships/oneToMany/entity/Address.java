package com.java.jparelationships.oneToMany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
  
  @Id
  @Column (name = "ADDR_ID")
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private int id;
  
  private String addressType;
  
  private String city;
  
  private String state;
  
  @JsonBackReference
  @ManyToOne
  private Customer customer;
  
  public Address() {
  }
  
  public Address(String addressType, String city, String state) {
    this.addressType = addressType;
    this.city = city;
    this.state = state;
  }
  
  public String getAddressType() {
    return addressType;
  }
  
  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }
  
  
  public String getCity() {
    return city;
  }
  
  public void setCity(String city) {
    this.city = city;
  }
  
  public String getState() {
    return state;
  }
  
  public void setState(String state) {
    this.state = state;
  }
  
}
