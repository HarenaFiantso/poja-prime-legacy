package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.service.event.PrimeService;
import java.math.BigInteger;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prod")
@AllArgsConstructor
public class PrimeController {
  private final PrimeService primeService;

  @GetMapping("/new-prime")
  public BigInteger generatePrime() {
    return primeService.generatePrimeNumber();
  }
}
