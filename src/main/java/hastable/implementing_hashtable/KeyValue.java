package main.java.hastable.implementing_hashtable;

public class KeyValue {
	
	private String key;
	private int value;
	
	public KeyValue() {
	}
	
	public KeyValue(String key, int value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "KeyValue [key=" + key + ", value=" + value + "]";
	}

}
