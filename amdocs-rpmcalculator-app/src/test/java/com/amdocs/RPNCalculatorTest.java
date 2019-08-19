package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RPNCalculatorTest {
	
	private RPNCalculator rpnCalculator;
	private double actualResult, expectedValue;
	
	@AfterClass
	public static void tearDown() {
		System.out.println("After class method");
	}
	
	@BeforeClass
	public static void initOnce() {
		System.out.println("Before class method");
	}
	
	@Before
	public void init() {
		rpnCalculator = new RPNCalculator();
		actualResult=expectedValue=0.0;
		System.out.println("Before method");
	}
	
	@After
	public void cleanUp() {
		rpnCalculator = null;
		System.out.println("After method");
	}
	
	@Test
	public void testSimpleAddition(){
		
		
		actualResult = rpnCalculator.evaluate("10 15 +");
		expectedValue= 25.0;
		
		assertEquals(expectedValue, actualResult,0.0001);
		
		actualResult = rpnCalculator.evaluate("100 20 /");
		expectedValue= 5.0;
		
		assertEquals(expectedValue, actualResult,0.0001);
		
		actualResult = rpnCalculator.evaluate("20 10 -");
		expectedValue= 10.0;
		
		assertEquals(expectedValue, actualResult,0.0001);
		
		actualResult = rpnCalculator.evaluate("20 10 *");
		expectedValue= 200.0;
		
		assertEquals(expectedValue, actualResult,0.0001);
		
		actualResult = rpnCalculator.evaluate("10 10 + 100 20 / *");
		expectedValue= 100.0;
		
		assertEquals(expectedValue, actualResult,0.0001);
}

}