package com.poja.prime.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.poja.prime.conf.FacadeIT;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class PrimeControllerIT extends FacadeIT {
  @Autowired PrimeController primeController;

  @Test
  void new_prime_ok() {
    BigInteger actual = primeController.generateNewPrime();

    int certainly = (int) (99.99 * 100);
    assertTrue(actual.isProbablePrime(certainly));
  }
}
