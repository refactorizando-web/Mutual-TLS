package com.refactorizando.example.mutualtls.exception;

public class ServiceExpirationDateException extends RuntimeException {

  public ServiceExpirationDateException() {
    super();
  }

  public ServiceExpirationDateException(String message, Throwable cause) {
    super(message, cause);
  }

  public ServiceExpirationDateException(String message) {
    super(message);
  }

  public ServiceExpirationDateException(Throwable cause) {
    super(cause);
  }
}