package com.amdocs;

import java.util.Stack;

public class RPNCalculator {
	
	Stack<Double> numberStack;
	private double firstNumber,secondNumber,result;
	
	public RPNCalculator() {
		numberStack = new Stack<Double>();
		firstNumber=secondNumber=result=0.0;
	}

	public double evaluate(String rpnMathExpression) {
		String[] rpnToken = rpnMathExpression.split(" ");
		IMathOperation mathOperation =null;
		
		for(String token : rpnToken) {
			System.out.println(token);
			
			if(isMathOperator(token)) {
				secondNumber=numberStack.pop();
				firstNumber=numberStack.pop();
				mathOperation = MathFactory.getobject(token);
				result=mathOperation.evaluate(firstNumber,secondNumber);
				numberStack.push(result);
				//System.out.println(result);
				System.out.println(token+"sign");
			}
			else
				numberStack.push(Double.parseDouble(token));
				
		}
		
		return numberStack.pop();
	}

	private boolean isMathOperator(String token) {
	String mathOperators="+-*/"	;
	System.out.println(mathOperators.contains(token));
	return mathOperators.contains(token);
	}

}
