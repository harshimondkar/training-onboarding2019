package com.amdocs;

import org.tempuri.*;

public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("java.net.useSystemProxies", "true");
    	Calculator calculator = new Calculator();
    	CalculatorSoap services = calculator.getCalculatorSoap();
    	int x =100;
    	int y=200;
    	int result = services.add(x, y);
    	System.out.println("The sum of " +x+ " and "+y+" is "+result);
    }
}
