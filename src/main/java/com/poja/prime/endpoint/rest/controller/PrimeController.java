package com.poja.prime.endpoint.rest.controller;

import java.math.BigInteger;
import java.security.SecureRandom;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prod")
@Setter
public class PrimeController {
  private SecureRandom secureRandom;

  @GetMapping("/new-prime")
  public String generateNewPrime() {
    if (secureRandom == null) {
      secureRandom = new SecureRandom();
    }
    BigInteger prime = BigInteger.probablePrime(10_000, secureRandom);
    return prime.toString();
  }
}
