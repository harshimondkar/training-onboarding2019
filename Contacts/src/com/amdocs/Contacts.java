package com.amdocs;

import java.util.HashMap;
import java.util.Scanner;

public class Contacts {
	
	private HashMap<String, String> contacts;

	public Contacts() {
		this.contacts = new HashMap<String, String>();
	}
	
	public void addContact( String mobNumber,String name) {
		contacts.put(mobNumber,name);
		
	}
	
	public String findContactByMobNumber(String mobNumber) {
		String name = contacts.get(mobNumber);
		
		if(name==null)
			return mobNumber;
		else
			return name;
	}
	
	public static void main(String[] args) {
		Contacts contacts = new Contacts();
		contacts.addContact( "9000152561","kamal");
		contacts.addContact( "9001485263","Syam");
		
		System.out.println("Enter Contact number");
		Scanner sc = new Scanner(System.in);
		
		String phn = sc.next();
		System.out.println(contacts.findContactByMobNumber(phn));
		

	}
	

}
