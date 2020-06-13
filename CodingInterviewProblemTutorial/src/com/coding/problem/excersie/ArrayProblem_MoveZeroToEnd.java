/**
 * 
 */
package com.coding.problem.excersie;

import java.util.Arrays;

/**
 * @author Sunil
 *
 */
public class ArrayProblem_MoveZeroToEnd {
	
	static int[] moveZeros(int[] arr) {
		 int l = 0;
		
		for (int i = 0; i < arr.length; i++) {
	        if (arr[i] != 0) {
	            arr[l] = arr[i];
	            l++;
	        }
	    }
	 	// After we have finished processing new elements,
	 	// all the non-zero elements are already at beginning of array.
	 	// We just need to fill remaining array with 0's.
	    for (int i = l; i < arr.length; i++) {
	        arr[i] = 0;
	    }
		return arr;
	}

	static int[] moveZerosUsingWhile(int[] arr) {
		 int l = 0;
		 int i = 0;
		while(i < arr.length) {
	        if (arr[i] != 0) {
	            arr[l] = arr[i];
	            l++;
	        }
	        i++;
	    }
	 	// After we have finished processing new elements,
	 	// all the non-zero elements are already at beginning of array.
	 	// We just need to fill remaining array with 0's.
	    while(l < arr.length) {
	        arr[l] = 0;
	        l++;
	    }
		return arr;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {3,6,0,1,0,0,5,8};
        System.out.println(Arrays.toString(moveZeros(in)));   
        System.out.println(Arrays.toString(moveZerosUsingWhile(in)));   
	}

}
