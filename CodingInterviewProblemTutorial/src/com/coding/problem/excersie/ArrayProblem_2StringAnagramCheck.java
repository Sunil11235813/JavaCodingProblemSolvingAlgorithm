/**
 * 
 */
package com.coding.problem.excersie;

/**
 * @author Sunil
 *
 */
public class ArrayProblem_2StringAnagramCheck {

	static boolean isAnagram(String s1, String s2) {
		boolean flag = false;
		if(s1.length() != s2.length()) {
			return flag;
		}
		int[] cha = new int[26];
		for(int i=0; i<s1.length(); i++) {
			cha[s1.charAt(i) - 'a']++;
			cha[s2.charAt(i) - 'a']--;
		}
		for(int i = 0;i<26; i++) {
			if(cha[i] != 0) {
				return flag;
			}
		}
		flag = true;
		return flag;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("cat", "rat"));
		System.out.println(isAnagram("cat", "atc"));
	}

}
