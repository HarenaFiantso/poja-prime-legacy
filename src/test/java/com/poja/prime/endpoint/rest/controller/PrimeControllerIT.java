package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.conf.FacadeIT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeControllerIT extends FacadeIT {
  @Autowired PrimeController primeController;

  @Test
  void new_prime_ok() {
    BigInteger actual = primeController.generatePrime();

    int certainly = (int) (99.99 * 100);
    assertTrue(actual.isProbablePrime(certainly));
  }
}
