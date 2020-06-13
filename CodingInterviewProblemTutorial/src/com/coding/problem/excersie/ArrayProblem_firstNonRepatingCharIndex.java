/**
 * 
 */
package com.coding.problem.excersie;

import java.util.HashMap;

/**
 * @author Sunil
 *
 */
public class ArrayProblem_firstNonRepatingCharIndex {

	static int firstNonReaptingCharindex(String s1) {
		int min = Integer.MAX_VALUE;
		if(s1.length() == 1) {
			return 0;
		}
		HashMap<Character, Integer> storeIndex = new HashMap<>();
		for(int i = 0; i<s1.length(); i++) {
			if(storeIndex.containsKey(s1.charAt(i))) {
				storeIndex.put(s1.charAt(i), -1);
			}else {
				storeIndex.put(s1.charAt(i), i);
			}			
		}
		for(char c : storeIndex.keySet()) {
			if(storeIndex.get(c) > -1 && storeIndex.get(c) < min) {
				min = storeIndex.get(c);
			}
		}
		
		return min;
	}
	static char firstNonReaptingChar(String s1) {
		int min = Integer.MAX_VALUE;
		if(s1.length() == 1) {
			return s1.charAt(0);
		}
		HashMap<Character, Integer> storeIndex = new HashMap<>();
		for(int i = 0; i<s1.length(); i++) {
			if(storeIndex.containsKey(s1.charAt(i))) {
				storeIndex.put(s1.charAt(i), -1);
			}else {
				storeIndex.put(s1.charAt(i), i);
			}			
		}
		for(char c : storeIndex.keySet()) {
			if(storeIndex.get(c) > -1 && storeIndex.get(c) < min) {
				min = storeIndex.get(c);
			}
		}
		
		return s1.charAt(min);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" first Non Reapting char Index "+firstNonReaptingCharindex("leetcode"));
		System.out.println(" first Non Reapting char Index "+firstNonReaptingCharindex("loveleetcode"));
		System.out.println(" first Non Reapting char Index "+firstNonReaptingChar("leetcode"));
		System.out.println(" first Non Reapting char Index "+firstNonReaptingChar("loveleetcode"));
	}

}
