/**
 * 
 */
package com.coding.problem.excersie;

/**
 * @author Sunil
 *
 */
public class ForLoopProblem1_PrintStairOrPattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfStair = 6;
		for(int i = 0; i < numberOfStair ; i++) {
			for(int j = 0; j < numberOfStair - i; j++) {
				System.out.print(" ");
			}
			for(int k = numberOfStair; k >  0 ; k--) {
				if(numberOfStair - i <= k) {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}
