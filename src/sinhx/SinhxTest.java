package sinhx;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SinhxTest {
  /**
   * This test will compare Math.sinhx with implemented function sinhx, when the value of x is a
   * negative real value.
   */
  @Test
  void testSinhxNegValue() {
    double input = -40.65;
    double expectedValue = Math.sinh(input);
    double obtainedValue = Sinhx.calculationOfSinhx(input);
    Assert.assertEquals(Math.round(expectedValue), Math.round(obtainedValue), 0.000000001);
  }

  /**
   * This test will compare Math.sinhx with implemented function sinhx, when the value of x is a
   * positive real value.
   */
  @Test
  void testSinhxPosValue() {
    double input = 700.569;
    double expectedValue = Math.sinh(input);
    double obtainedValue = Sinhx.calculationOfSinhx(input);
    Assert.assertEquals(Math.round(expectedValue), Math.round(obtainedValue), 0.000000001);
  }

  /**
   * This test will compare Math.sinhx with implemented function sinhx, when the value of x is zero.
   */
  @Test
  void testForValueZero() {
    double input = 0;
    double expectedValue = Math.sinh(input);
    double obtainedValue = Sinhx.calculationOfSinhx(input);
    Assert.assertEquals(expectedValue, obtainedValue, 0.00000001);
  }

  /**
   * This test will test whether the implemented function is accepting a numeric value or not. This
   * test will pass if the function returns numeric value when input is a numeric value.
   */
  @Test
  void testNumericValue() {
    String input = "312";
    String expected = "312";
    String obtained = Sinhx.readInputUntillNumFound(input);
    Assert.assertEquals(expected, obtained);
  }

  /**
   * This test will test whether the implemented function is not accepting a non numeric value or
   * not. The test will pass if the function returns null value(not accepting non numeric value)
   * when the input is non numeric value.
   */
  @Test
  void testNonNumericValue() {
    String input = "rr";
    String expected = null;
    String obtained = Sinhx.readInputUntillNumFound(input);
    Assert.assertEquals(expected, obtained);
  }
}
