package simcalc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void test() {
		SimpleCalculator calc=new SimpleCalculator();
		calc.add(10,20);
		assertEquals(30,calc.getResult());
	}
	@Test
	public void testSub() {
		SimpleCalculator calc=new SimpleCalculator();
		calc.sub(10, 20);
		assertEquals(-10,calc.getResult());
	}
	@Test
	public void testMultifunc() {
		SimpleCalculator calc=new SimpleCalculator();
		calc.mul(10, 20);
		assertEquals(200,calc.getResult());
	}
	public void testdiv() {
		SimpleCalculator calc=new SimpleCalculator();
		calc.div(100, 20);
		assertEquals(5,calc.getResult());
	}
}
