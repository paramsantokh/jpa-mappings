package com.java.jparelationships.oneToMany.dto;

public class CustomerResponse {
  private String customerName;
  private String city;
  
  public CustomerResponse(String customerName, String city) {
    this.customerName = customerName;
    this.city = city;
  }
  
  public String getCustomerName() {
    return customerName;
  }
  
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  
  public String getCity() {
    return city;
  }
  
  public void setCity(String city) {
    this.city = city;
  }
}
