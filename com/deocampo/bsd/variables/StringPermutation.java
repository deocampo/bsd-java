package com.deocampo.bsd.variables;
/**
 *
 * 
 * Given two strings, write a method to decide if one is a permutation of the other.
 *
 * Modified from : https://github.com/ggpaue/CrackingTheCodingInterview
 * 
 */

public class StringPermutation {
	
	public static boolean permutation(String s, String t) {
		// Exit immediately if lengths are not equal.
		if(s.length() != t.length()) return false;
		// Create array of extended ASCII codes has 256 chars
		int[] letters = new int[256];
		// Create array of characters for first string
		char[] s_array = s.toCharArray();
		
		for(char c : s_array) {
			letters[c]++;
		}
		
		for(int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			if(--letters[c] < 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"trump", "rump"}, {"mart", "tram"}, {"snail", "nails"}};
		for(String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}

}