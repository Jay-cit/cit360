package JUnit.test;

import junit.framework.TestCase;
import JUnit.module.Calculator;



public class Test3_Calculator extends TestCase{
	
	private Calculator cal = new Calculator();
	
	
	private final int delta = 0; 	
	
	public void testAdd() {
		assertEquals("Add", (double) 60.0, this.cal.add(10, 50), this.delta);
	}
	
	public void testSub() {
		assertEquals("Subtract", (double) -40.0, this.cal.sub(10, 50), this.delta);
	}
	
	public void testDiv() {
		assertEquals("Divide¨", (double) 0.2, this.cal.div(10, 50), this.delta);
	}
	
	public void testMul() {
		assertEquals("Multiply", (double) 500.0, this.cal.mul(10, 50), this.delta);
	}
	
	public void testMod() {
		assertEquals("Residual", (double) 10.0, this.cal.mod(10, 50), this.delta);
	}
}