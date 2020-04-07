package com.java.jparelationships.oneToOne;

import com.java.jparelationships.oneToOne.entity.Library;

public class LibraryRequest {
  
  private Library library;
  
  public LibraryRequest() {
  }
  
  public LibraryRequest(Library library) {
    this.library = library;
  }
  
  public Library getLibrary() {
    return library;
  }
  
  public void setLibrary(Library library) {
    this.library = library;
  }
}
