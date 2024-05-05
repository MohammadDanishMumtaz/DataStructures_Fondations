package main.java.hastable.implementing_hashtable;

import java.util.ArrayList;

public class Hashtable {

	// create an array that will hold elements of type ArrayList<KeyValue>.
	// ArrayList<keyValue> means the ArrayList holds Objects of type - keyValue as
	// its elements.
	ArrayList<KeyValue>[] data;
	int currentLength;

	public Hashtable(int size) {
		data = new ArrayList[size];
		currentLength = 0;
	}

	private int _hash(String key) {
		int hash = 0;
		for (int i = 0; i < key.length(); i++) {
			hash = (hash + key.codePointAt(i) * i) % data.length;
		}
		return hash;
	}

	public void set(String key, int value) {
		int address = _hash(key);
		if (data[address] == null) {
			ArrayList<KeyValue> arrayAtAddress = new ArrayList<>();
			data[address] = arrayAtAddress;
			currentLength++;
		}
		KeyValue pair = new KeyValue(key, value);
		data[address].add(pair);

	}

	public Integer get(String key) {
		int address = _hash(key);
		ArrayList<KeyValue> bucket = data[address];
		if (null != bucket) {
			for (KeyValue keyValue : bucket) {
				if (keyValue.getKey().equals(key)) {
					return keyValue.getValue();
				}
			}
		}
		return null;
	}

	public String[] keys() {
	  ArrayList<KeyValue>[] bucket = data;
	  String[] keysArray = new String[currentLength];
	  int count = 0;
	  for (ArrayList<KeyValue> keyValues : bucket) {
		  if(null != keyValues) {
			  keysArray[count] = keyValues.get(0).getKey();
			  count ++;
		  }
	  }
	  return keysArray;
	}
	
	public String keysToString(String[] keys) {
		String keysAsString = "[ ";
		int count = 1;
		for (String key : keys) {
			if (count == keys.length) {
				keysAsString = keysAsString + key + " ]";
			} else {
				keysAsString = keysAsString + key + " , ";
				count++;
			}
		}
		return keysAsString;
	}
	
	public static void main(String[] args) {
		 Hashtable hashTable = new Hashtable(50);
		 hashTable.set("cars", 1);
		 hashTable.set("bikes", 2);
		 hashTable.set("buses", 0);
		 System.out.println("value for cars : " +hashTable.get("cars"));
		 System.out.println("get all keys : " + hashTable.keysToString(hashTable.keys()));
	}

}
