package com.poja.prime.endpoint.rest.controller;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class PrimeControllerIT {
  @Test
  public void testGenerateNewPrime() {
    PrimeController primeController = new PrimeController();

    SecureRandom secureRandomMock = Mockito.mock(SecureRandom.class);

    Mockito.when(secureRandomMock.nextInt()).thenReturn(1);

    primeController.setSecureRandom(secureRandomMock);

    String result = primeController.generateNewPrime();

    BigInteger generatedPrime = new BigInteger(result);
    Assertions.assertEquals(
        10000,
        generatedPrime.bitLength(),
        "The length of prime number generated is different of 10_000 bits");
  }
}
