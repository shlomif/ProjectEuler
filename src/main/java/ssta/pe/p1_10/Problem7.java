package ssta.pe.p1_10;

import ssta.pelib.SimplePrimeSieve;
import ssta.pelib.SsMath;

import java.util.List;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem7 {
  /**
   * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
   * that the 6th prime is 13.
   * <p>
   * What is the 10 001st prime number?
   */
  public String solve() {
    int MAX = 10001;
    List<Long> primes = SimplePrimeSieve.getSieveWithMaxPrime(MAX).getPrimes();

    String result = String.valueOf(primes.get(MAX - 1));
    return result;
  }
}
