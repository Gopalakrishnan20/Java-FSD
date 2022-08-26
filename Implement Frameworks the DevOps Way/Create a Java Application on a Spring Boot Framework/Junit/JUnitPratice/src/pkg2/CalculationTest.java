package pkg2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculationTest {
	@Test
	void test() {
		Calculation obj=new Calculation();
		assertEquals(11, obj.addition(5,6));
	}

}
