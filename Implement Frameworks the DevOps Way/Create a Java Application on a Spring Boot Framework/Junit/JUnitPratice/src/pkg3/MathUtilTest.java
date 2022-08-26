package pkg3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class MathUtilTest {
	 
	  @Test
	  void test_Add() {
	    assertEquals(5, MathUtil.add(3, 2));
	  }
	  
	  @Test
	  void test_Multiply() {
	    assertEquals(15, MathUtil.multiple(3, 5));
	  }

	  @Test
	  void test_Devide() {
	    assertEquals(5, MathUtil.divide(25, 5));
	  }
	  
	  @Test
	  void testIs_Prime() {
	    assertTrue(MathUtil.isPrime(13));
	  }

}
