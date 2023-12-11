package com.poja.prime.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.poja.prime.conf.FacadeIT;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class PrimeControllerIT extends FacadeIT {
  @Autowired PrimeController primeController;

  @Test
  void generateNewPrime_returnsValidNumber() {
    String result = primeController.generateNewPrime();

    BigInteger generatedPrime = new BigInteger(result);
    int expectedBitLength = 10_000;
    assertEquals(
        expectedBitLength,
        generatedPrime.bitLength(),
        "The length of the prime number generated isn't the same as 10_000 bits");
  }
}
