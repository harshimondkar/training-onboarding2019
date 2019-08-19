package com.amdocs;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(100);
		number.add(40);
		number.add(150);
		number.add(200);
		number.add(110);

		System.out.println("Size of array is "+number.size()+"\n\nArray elements before sorting are :");
		
		for(int element:number) {
			System.out.println(element+"\n");
		}

		Collections.sort(number);
		System.out.println("\nArray elements after sorting are :");
		for(int element:number) {
			System.out.println(element+"\n");
		}
		
	}

}
