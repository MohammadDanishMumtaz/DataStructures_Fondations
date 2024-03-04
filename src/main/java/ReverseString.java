package main.java;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
	
	public static void main(String args[]) {
		String sent= "My name is Danish";
		
		reverse1(sent);
		reverse2(sent);
		reverse3(sent);
		
		
	}

	private static void reverse1(String sent) {
		String[] array = sent.split("");
		String reverse = "";
		for(int i= array.length -1; i >= 0 ; i--) {
			reverse = reverse + array[i];
		}
		System.out.println(reverse);
	}
	
	private static void reverse2(String sent) {
		if(null!= sent && sent.length() != 2 )
		  System.out.println(new StringBuilder(sent).reverse().toString());
		else {
		  System.out.println("bad string");
		}
			
	}
	
	private static void reverse3(String sent) {
		System.out.println(Stream.of(sent)
		      .map(word -> new StringBuilder(word).reverse())
		      .collect(Collectors.joining("")));
		
	}

}
