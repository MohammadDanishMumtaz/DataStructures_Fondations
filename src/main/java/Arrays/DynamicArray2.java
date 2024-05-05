package main.java.Arrays;

public class DynamicArray2 {
	
	private String[] array;
	
	private int currentLength;
	
	private int capacity;
	
	public DynamicArray2() {
		array = new String[1];
		capacity = 1;
		currentLength = 0;
		
	}
	
	public String get(int index) {
		if(index > -1 && index < currentLength) {
			return array[index];
		}else {
			return "Index out of bounds";
		}
	}
	
   public void push(String element) {
	   if(currentLength == capacity) {
		   
		   String[] tempArray = new String[2* capacity];
		   
		   for(int i=0 ; i < array.length; i++) {
			   tempArray[i] = array[i];
		   }
		   
		   array = tempArray;
		   
		   capacity = capacity * 2;
	   }
	   
	   array[currentLength] = element;
	   
	   currentLength++;
   }
   
   public void replace(int index, String value) {
	   if( index > -1 && index < currentLength) {
		   array[index] = value;
	   }else {
		   System.out.println("Index out of bounds");
	   }
   }
   
   public void pop() {
	   if(currentLength > 0) {
		   currentLength --;
	   }
   }
   
   public void delete (int index) {
	   if (index > -1 && index < currentLength ) {
		   if(index == currentLength -1 ) {
			   pop();
		   } else {
			   for (int i= index; i < currentLength -1 ; i++) {
				   array[i]= array[i+1];
				   
			   }
			    
			   currentLength --;
		   }
		   
	   }else {
		   System.out.println("Index out of bounds");
	   }
   }
   
   public String[] getArray() {
	   String[] tempArray = new String[currentLength];
	   for (int i=0 ; i < currentLength; i++) {
		   tempArray[i]= array[i];
	   }
	   return tempArray;
   }
	
   public int length() {
	   return currentLength;
   }

}
