package com.amdocs;

import java.util.Scanner;

public class Main {
	
	public static void displayMenu() {
		System.out.println("QuickSort------1\nBubblesort------2");
	}
	
	public static int getChoice() {
		System.out.println("enter ur choice");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void doWork(int choice) {
		iAlgorithm algo = AlgorthmFactory.getAlgorithm(choice);
		algo.sort();
	}
	
	public static void main(String[] args) {
		int choice = 0;
		while(choice != 3) {
			displayMenu();
			choice = getChoice();
			if(choice!=3)
				doWork(choice);
		}
		System.out.println("App exited");
	}

}
