package com.amdocs;

public class MobileFactory {
	public static iMobile getMobile(String mobileName) {
		iMobile mobile = null;
		
		if(mobileName.equals( "iPhone4"))
			mobile = new iPhone4();
		else if(mobileName.equals( "iPhone5"))
			mobile = new iPhone5();
		else 
			mobile = new NullMobile();
		
		return mobile;
	}
}
