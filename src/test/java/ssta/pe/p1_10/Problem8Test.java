package ssta.pe.p1_10;

import ssta.pe.p001_010.Problem8;
import junit.framework.TestCase;

/**
 * Created by ssta on 04/05/15.
 */
public class Problem8Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem8().solve();
    assertEquals("23514624000", result);
  }
}