/**
 * 
 */
package com.coding.problem.excersie;

/**
 * @author Sunil
 *
 */
public class ArrayProblem_FindFirst_LastOccur_SortedArray {
	
	static int findLastOccurance(int[] arr, int ele) {
		int st = 0, ed = arr.length - 1 , res = -1;
		
		while(st <= ed) {
			int mid = st + (ed - st)/2;
			if(arr[mid] == ele) {
				res = mid;
				st = mid + 1;
			}
			else if(arr[mid] < ele) {
				st = mid + 1;
			}else {
				ed = mid - 1;
			}
		}		
		return res;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,10,10,10,20,50};
        System.out.println(findLastOccurance(arr, 10));
	}

}
