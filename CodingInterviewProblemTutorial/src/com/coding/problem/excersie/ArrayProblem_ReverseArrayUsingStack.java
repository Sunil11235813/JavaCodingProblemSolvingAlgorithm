/**
 * 
 */
package com.coding.problem.excersie;

import java.util.Stack;

/**
 * @author Sunil
 *
 */
public class ArrayProblem_ReverseArrayUsingStack {
	
	static String reverseUsingStack(String input) {
		StringBuilder output = new StringBuilder();
		int i = input.length();
		Stack<Character> temp = new Stack<>();
		for(char ch : input.toCharArray()) {
			temp.push(ch);
		}
		while(i > 0) {
			output.append(temp.pop());
			i--;
		}		
		return output.toString();
	}
	
	static String reverseUsingPointer(String input) {
		int left = 0, right = input.length() - 1;
		char[] out = input.toCharArray();
		while(left < right) {
			char temp = out[left];
			out[left++]=out[right];
			out[right--]=temp;					
		}
		return new String(out);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("reverse of string using stack "+reverseUsingStack("Hello"));
         System.out.println("reverse of string using stack "+reverseUsingPointer("Hello"));
	}

}
