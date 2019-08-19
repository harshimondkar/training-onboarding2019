package com.amdocs;

public class AlgorthmFactory {
 public static iAlgorithm getAlgorithm(int choice) {
	 iAlgorithm algo = null;
	 
	 if(choice ==1 )
		 algo = new QuickSort();
	 else if(choice == 2)
		 algo= new BubbleSort();
	 else 
		 algo = new NullAlgorithm();
	 
	 return algo;
 }
}
