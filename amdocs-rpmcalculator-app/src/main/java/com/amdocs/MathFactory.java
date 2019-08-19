package com.amdocs;

public class MathFactory {

	public static IMathOperation getobject(String mathOperator) {

		IMathOperation mathOperation = null;
		
		
		if(mathOperator.equals("+"))
			mathOperation = new Addition();
		else if(mathOperator.equals("-"))
			mathOperation = new Subtraction();
		else if(mathOperator.equals("*"))
			mathOperation = new Multiplication();
		else if(mathOperator.equals("/"))
			mathOperation = new Division();
		
		return mathOperation;
	}

}
