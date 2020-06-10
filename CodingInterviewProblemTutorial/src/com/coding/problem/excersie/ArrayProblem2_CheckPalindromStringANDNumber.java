/**
 * 
 */
package com.coding.problem.excersie;

import java.util.Stack;

/**
 * @author Sunil
 *
 */
public class ArrayProblem2_CheckPalindromStringANDNumber {

	static boolean checkNumberPalindrom(int input) {
		boolean flag = false;
		int hold = 0,original=input;
		while(input > 0) {
			int tmp = input%10;
			hold = hold * 10 + tmp;
			input = input/10;			
		}
		if(original==hold)flag=true;
		return flag;
	}
	
	static boolean checkStringPalindrom(String input) {
		boolean flag = false;
		int i = 0, j = input.length()-1;
		flag = isPlaindrom(input,i,j);		
		return flag;
	}
	
	static boolean isPlaindrom(String s, int i , int j) {
		if(i==j)return true;		
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	 public static boolean isValid(String s) {
	        Stack<Character> expressionBucket1 = new Stack<>();
	        Stack<Character> expressionBucket2 = new Stack<>();
	        Stack<Character> expressionBucket3 = new Stack<>();
	        for(char c : s.toCharArray()){
	            if(c == '('){
	                expressionBucket1.push(c);
	            }
	            if(c == '{'){
	                expressionBucket2.push(c);
	            }
	            if(c == '['){
	                expressionBucket3.push(c);
	            }  
	             if(c == ')'){
	                 if(expressionBucket1.size() != 0)
	                   expressionBucket1.pop();
	            }
	            if(c == '}'){
	                 if(expressionBucket1.size() != 0)
	                   expressionBucket2.pop();
	            }
	            if(c == ']'){
	                 if(expressionBucket1.size() != 0)
	                   expressionBucket3.pop();
	            }       
	        }
	        if(expressionBucket1.size() == 0 && expressionBucket2.size() == 0 && expressionBucket3.size() == 0){
	            return true;
	        }
	        return false;
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(checkNumberPalindrom(1234321));
		//System.out.println(checkStringPalindrom("sun"));
		System.out.println(isValid("(){}[]") );
	}

}
