package com.Amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class SavingsAccountTest {
	
	private SavingsAccount acc;
	private SavingsAccount accSpy;
	
	@Before 
	public void setUp() {
		acc = new SavingsAccount();
		accSpy = spy(acc);
		
	}
	
	@After
	public void tearDown() {
		acc = null;
		accSpy = null;
	}
	
	@Ignore
	@Test
	public void testWithdrawWhenCurrentAccountIs5000INR() throws InsufficientBalanceException {
				
		boolean exceptionThrown = false;
		//Stubbing
		doReturn(500.0).when(accSpy).getBalance();
		doNothing().when(accSpy).updateBalanceIntoDB(anyDouble());
		try {
			accSpy.withdraw(10000.0);
		}
		catch (InsufficientBalanceException e) {
			// TODO: handle exception
			exceptionThrown = true;
		}
		
		 boolean expectedResponse = true;
		 
		 assertEquals(expectedResponse, exceptionThrown);
		 
		
		verify(accSpy,times(1)).getBalance();
		
		verify(accSpy,times(0)).updateBalanceIntoDB(anyDouble());
		
	}

	

}
