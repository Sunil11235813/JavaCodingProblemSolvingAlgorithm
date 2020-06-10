/**
 * 
 */
package com.coding.problem.excersie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Sunil
 *
 */
public class HashMapProblem_GroupAnagrams {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word = {"eat", "tea", "tan", "ate", "nat", "bat"};
		HashMap<String,LinkedList<String>> groupAnagramBucket = new HashMap<>();
		for(String s : word) {
			char[] sChar = s.toCharArray();
			Arrays.sort(sChar);
			String temp = new String(sChar);
			if(groupAnagramBucket.containsKey(temp)) {
				LinkedList<String> gList = groupAnagramBucket.get(temp);
				gList.add(s);
				groupAnagramBucket.put(temp,gList);
			}else {
				LinkedList<String> gList = new LinkedList<>();
				gList.add(s);
				groupAnagramBucket.put(temp,gList);
			}
		}
		for(String keys : groupAnagramBucket.keySet()) {
			System.out.println(groupAnagramBucket.get(keys));
		}
	}

}
