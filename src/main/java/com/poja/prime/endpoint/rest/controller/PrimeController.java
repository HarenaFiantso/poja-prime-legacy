package com.poja.prime.endpoint.rest.controller;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/preprod")
public class PrimeController {

  @GetMapping("/new-prime")
  public String generateNewPrime() {
    SecureRandom secureRandom = new SecureRandom();
    BigInteger prime = BigInteger.probablePrime(10_000, secureRandom);

    return prime.toString();
  }
}
