package main.java;

import java.util.stream.Stream;

public class MergeSortedArrays {
	
	public static void main(String args[]) {
		int[] arr1 = {0, 3, 4, 31};
		int[] arr2 = {4, 6, 30};
		
		merge(arr1, arr2);
	}

	private static void merge(int[] arr1, int[] arr2) {
		
          int[] tempArray = new int[arr1.length+ arr2.length];
          for (int i=0 ; i < arr1.length; i++) {
        	  tempArray[i] = arr1[i];
          }
          
          
	}

}
