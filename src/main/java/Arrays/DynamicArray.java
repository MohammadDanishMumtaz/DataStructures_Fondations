package main.java.Arrays;

import java.util.Arrays;

//https://github.com/satya-verma/Data-Structures-and-Algorithms--using-JAVA/blob/master/src/data_structures/arrays/array_implementation/DynamicArray.java
public class DynamicArray {
	
	// we will store our elements in the array
	private String[] array;
	
	// capacity is the number of elements that our array can hold. 
	private int capacity;
	
	// currentLength is the number of elements currently present in the array.
	private int currentLength;
	
	public DynamicArray() {
		array = new String[1];
		capacity = 1;
		currentLength = 0;
	}
	
	
	/**
	 * Get the item from a particular index
	 * @param index
	 * @return
	 */
	public String get(int index) {
		if(index > -1 && index < currentLength) {
			return this.array[index];
		}else {
			return "Index out of bounds";
		}
	}
	
	/**
	 * Push an element into an array
	 * @param element
	 */
	public void push(String element) {
		
		//if currentLength becomes equal to capacity we need to increase the capacity of the array two twice its current size
		if(currentLength == capacity) {
			
			// create a new Array with twice the capacity
			String[] tempArray = new String[2 * capacity];
			
			// copy elements of old array to the new array
			for (int i=0; i < array.length ; i++) {
				tempArray[i] = array[i];
			}
			
			// set newly created array as our real array.
			array = tempArray;
			
			// update the value of capacity
			capacity = capacity * 2;
		}
		
		// insert the new element at the end
		array[currentLength] = element;
		
		// update value of the currentLength by 1
		currentLength ++;
		
	}
	
	// replace(index,value) replaces value at the given index with the newly entered value
	public void replace(int index, String value) {
		
		if(index > -1 && index < currentLength) {
			array[index] = value;
		}else {
			System.err.println("Index out of bounds");
		}
	}
	
	
	/**
	 * Remove the last element
	 */
	public void pop() {
		if(currentLength > 0) {
			currentLength --;
		}
		
	}
	
	public void delete(int index) {
		if (index > -1 && index < currentLength) {
			if (index == currentLength - 1) {
				pop();
				
			} else {
				for (int i = index; i < currentLength; i++) {
					array[i] = array[i + 1];
				}
				
				currentLength--;
			}
		} else {
			System.err.println("Index out of bounds");
		}

	}
	
	// get Array
	public String[] getArray() {
		String[] tempArr = new String[currentLength];
		for (int i=0 ; i < currentLength; i++) {
			tempArr[i] = array[i];
		}
		return tempArr;
	}
	
	public int length() {
		return currentLength;
	}
	

	public static void main(String[] args) {
		
     DynamicArray dynamicArray = new DynamicArray();
     dynamicArray.push("apple");
     dynamicArray.push("ball");
     dynamicArray.push("cat");
     dynamicArray.push("dog");
     
     System.out.println("Array-Length: "+ dynamicArray.length());
     System.out.println("array :" + Arrays.toString(dynamicArray.getArray()));
     System.out.println("Item at index 2: " + dynamicArray.get(2));
	 
     dynamicArray.replace(1, "world");
     
     System.out.println("array :" + Arrays.toString(dynamicArray.getArray()));
     
     dynamicArray.pop();
     
     System.out.println("array :" + Arrays.toString(dynamicArray.getArray()));
     
     dynamicArray.delete(1);
     
     System.out.println("array :" + Arrays.toString(dynamicArray.getArray()));

     System.out.println("Array-Length: "+ dynamicArray.length());

	}

}
