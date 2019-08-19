package com.amdocs;

public class Address {
	public String doorNo;
	public String street;
	public String street1;
	public String street2;
	public String city;
	public String pinCode;

// replacement for separate set methods instead of using default constructor
	public Address(String doorNo, String street1,String street2, String city, String pinCode) {
		super();
		this.doorNo = doorNo;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getDetails() {
		return "Address [doorNo=" + doorNo + ", street1=" + street1  +","+ street2 + ","
				+ " city=" + city + ", pinCode=" + pinCode + "]";

	}
	//getter method
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
}