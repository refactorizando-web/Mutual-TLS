package com.refactorizando.example.mutualtls.exception;

public class OrganizationNameException extends RuntimeException {

  public OrganizationNameException() {
    super();
  }

  public OrganizationNameException(String message, Throwable cause) {
    super(message, cause);
  }

  public OrganizationNameException(String message) {
    super(message);
  }

  public OrganizationNameException(Throwable cause) {
    super(cause);
  }
}