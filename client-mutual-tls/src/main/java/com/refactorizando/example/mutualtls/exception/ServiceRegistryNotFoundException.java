package com.refactorizando.example.mutualtls.exception;

public class ServiceRegistryNotFoundException extends RuntimeException {

  public ServiceRegistryNotFoundException() {
    super();
  }

  public ServiceRegistryNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public ServiceRegistryNotFoundException(String message) {
    super(message);
  }

  public ServiceRegistryNotFoundException(Throwable cause) {
    super(cause);
  }
}
