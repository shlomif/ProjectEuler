package ssta.pe.p11_20;

import ssta.pe.p011_020.Problem20;
import junit.framework.TestCase;

/**
 * Created by ssta on 06/05/15.
 */
public class Problem20Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem20().solve();
    assertEquals("648", result);
  }
}