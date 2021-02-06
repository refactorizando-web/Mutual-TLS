package com.refactorizando.example.mutualtls.server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerifyTLSController {

  @GetMapping("verify-connection")
  public ResponseEntity<String> getVerification() {
    return ResponseEntity.ok("Verified");
  }
}
