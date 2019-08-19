package com.Amdocs;


public class SavingsAccount {

	public double getBalance() {
		System.out.println("Assume balance is retrived");
		return 7000.0;
	}

	public double withdraw(double amountToBeWithdrawn)  throws InsufficientBalanceException {

		System.out.println("Inside withdraw method");
		
		double currentBalance= getBalance();
		
		if(amountToBeWithdrawn<currentBalance) {
			currentBalance = currentBalance - amountToBeWithdrawn;
		}
		else
			throw new InsufficientBalanceException();
		
		updateBalanceIntoDB(currentBalance);
		
		
		return currentBalance;
	}

	public void updateBalanceIntoDB(double currentBalance) {
		System.out.println("Current Balancce is updated");
		
	}
}
