package com.amdocs;

public class Main {

	public static void main(String[] args) {
		Address address = new Address("0001","Black Panther","New Moon","Dark Knight","500819");
		Employee hayat =  new Employee("Hayat", "Software engg", "Infra",address);
		
		System.out.println(hayat);
		

	}

}
