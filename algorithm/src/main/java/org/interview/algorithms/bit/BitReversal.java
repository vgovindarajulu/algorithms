package org.interview.algorithms.bit;



public class BitReversal {
	static int  temp = 0 ;

	public static void main(String[] args) {
		int x=5;
		System.out.println(Integer.toBinaryString(x));
		int noOfBits = Integer.toBinaryString(x).length();
	    int maxValue = 0; 
		while (noOfBits != 0){
			noOfBits --;
			maxValue = maxValue + (1 << noOfBits);
		}
		System.out.println( x ^ maxValue);
	}
}
