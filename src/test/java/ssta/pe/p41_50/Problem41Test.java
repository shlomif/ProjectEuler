package ssta.pe.p41_50;

import ssta.pe.p041_050.Problem41;
import junit.framework.TestCase;

/**
 * Created by ssta on 13/05/15.
 */
public class Problem41Test extends TestCase {

  public void testSolve() throws Exception {
    String result = new Problem41().solve();
    assertEquals("7652413", result);
  }
}