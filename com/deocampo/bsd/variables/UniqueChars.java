package com.deocampo.bsd.variables;

/**
 * 
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures. 
 * 
 * Modified from : https://github.com/ggpaue/CrackingTheCodingInterview
 * 
 **/
 
 
public class UniqueChars {
	
	// method 1 for checking unique characters
	public static boolean isUniqueChars(String str) {
		if(str.length() > 256) return false;
		int checker = 0;
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}

	
	// method 2 for checking unique characters
	public static boolean isUniqueChars2(String str) {
		if(str.length() > 256) return false;
		boolean[] char_set = new boolean[256];
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"uvxyz", "bannana", "welcome", "basket", "river boat"};
		for(String word : words) {
			System.out.println(word + ": " + isUniqueChars(word) + " " + isUniqueChars2(word));
		}
	}

}