package ssta.pe.p1_10;

import ssta.pelib.PrimesFromFile;
import ssta.pelib.SimplePrimeSieve;
import ssta.pelib.SsMath;

import java.io.OutputStream;
import java.util.List;

/**
 * Created by ssta on 03/05/15.
 */
public class Problem10 {
  /**
   * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
   * <p>
   * Find the sum of all the primes below two million.
   */
  public String solve() {
    // this problem is too big for the naive prime sieve from before, so
    // cheat by precomputing the primes and loading them from a resource file.
    List<Long> primes = PrimesFromFile.getPrimes();
    System.out.println(primes.size());
    OutputStream os;

    // streams are very nice!
    return primes.stream().
        filter(l -> l < 2000000L).
        reduce(0L, Long::sum).toString();
    //return String.valueOf(sum);

  }
}
