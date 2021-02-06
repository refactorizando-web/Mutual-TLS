package com.refactorizando.example.mutualtls.exception;

public class ServiceStartDateException extends RuntimeException {

  public ServiceStartDateException() {
    super();
  }

  public ServiceStartDateException(String message, Throwable cause) {
    super(message, cause);
  }

  public ServiceStartDateException(String message) {
    super(message);
  }

  public ServiceStartDateException(Throwable cause) {
    super(cause);
  }
}