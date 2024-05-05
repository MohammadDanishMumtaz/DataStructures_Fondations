package main.java.Arrays;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String args[]) {
		int[] arr1 = new int[] { 0, 3, 4, 31 };
		int[] arr2 = new int[] { 4, 6, 30 };

		MergeSortedArrays arraySort = new MergeSortedArrays();

		int[] finalArray = arraySort.merge(arr1, arr2);

		System.out.println(Arrays.toString(finalArray));

	}

	private int[] merge(int[] arr1, int[] arr2) {

		int[] finalArray = new int[arr1.length + arr2.length];

		int k = 0;
		int i = 0;
		int j = 0;

		if (arr2.length == 0) {
			return arr1;
		}

		if (arr1.length == 0) {
			return arr2;
		}

		// This check and update the final array in sorted manner when both the arrays
		// are of the
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				finalArray[k] = arr1[i];
				i++;
			} else {
				finalArray[k] = arr2[j];
				j++;
			}
			k++;
		}

		// if any remaining elements from array1
		while (i < arr1.length) {
			finalArray[k] = arr1[i];
			i++;
			k++;
		}

		// if any remaining elements from array 2
		while (j < arr2.length) {
			finalArray[k] = arr2[j];
			j++;
			k++;
		}

		return finalArray;

	}

}
