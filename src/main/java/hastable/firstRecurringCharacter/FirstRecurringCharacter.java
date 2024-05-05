package main.java.hastable.firstRecurringCharacter;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringCharacter {

	public void searchFirstRecurringCharacter(int[] numArray) {
		Map<Integer, Integer> addUniqueNum = new HashMap<>();
		int count = 0;
		for (int num : numArray) {
			if (!addUniqueNum.containsKey(num)) {
				addUniqueNum.put(num, count);
			} else {
				System.out.println("The first recurring number is : " + num + " at index : " + count);
				break;
			}
			if(count == numArray.length-1) {
				System.out.println("No recurring numbers");	
			}
			count++;
		}
	}

	public static void main(String[] args) {
		FirstRecurringCharacter firstRecurringCharacter = new FirstRecurringCharacter();
		firstRecurringCharacter.searchFirstRecurringCharacter(new int[] { 2, 5, 1, 2, 3, 5, 1, 2, 4 });
		firstRecurringCharacter.searchFirstRecurringCharacter(new int[] { 2, 1, 1, 2, 3, 5, 1, 2, 4 });
		firstRecurringCharacter.searchFirstRecurringCharacter(new int[] { 2, 3, 4, 5 });
	}

}
