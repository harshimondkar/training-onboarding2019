package com.amdocs;

import javax.jws.WebMethod;

public class Hello {
	@WebMethod
	public String sayHello()
	{
	return"Hello SOAP";	
	}
}
