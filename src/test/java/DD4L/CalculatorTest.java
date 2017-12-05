package DD4L;

import static org.junit.Assert.*;
import org.junit.Test;


public class CalculatorTest {

	@Test
	public final void testAdd() {
		Calculator calc = new Calculator();
		int expResult = 5;
		int result = calc.add(3, 2);
	    assertEquals(expResult, result);
	    }
	@Test
	public final void testSub() {
		Calculator calc = new Calculator();
		int expResult = 1;
		int result = calc.sub(3, 2);
	    assertEquals(expResult, result);
	    }
}




