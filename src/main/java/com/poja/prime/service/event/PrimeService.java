package com.poja.prime.service.event;

import java.math.BigInteger;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class PrimeService {
  public BigInteger generatePrimeNumber() {
    int bitLength = 10_000;
    return BigInteger.probablePrime(bitLength, new Random());
  }
}
