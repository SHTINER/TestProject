import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CalculatorTest {
	Calculator calc=null;
	

	@Before
	public void setBefore() {
		System.out.println("This method runs before tests!");
		calc = new Calculator();
	}

	@Rule
	public Timeout timeOut=new Timeout(230);
	
	@Test
	public void testAdd() {
		System.out.println("test add");
		int a = 6;
		int b = 2;
		int expectedResult = 8;
		int result = calc.add(a, b);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testDiv() {
		System.out.println("test div");
		int a = 6;
		int b = 2;
		int expectedResult = 3;
		int result = calc.div(a, b);
		assertEquals(expectedResult, result);
	}
	
}
