package org.interview.leetcode;

/**
 * Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.
 * Formally the function should:
 * Return true if there exists i, j, k 
 * such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
 * Your algorithm should run in O(n) time complexity and O(1) space complexity.

 * Examples:
 * Given [1, 2, 3, 4, 5],
 * return true.

 * Given [5, 4, 3, 2, 1],
 * return false.

 * @author vijay
 *
 */
public class TripletSubSequence {
	public static boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= min) min = num;
            else if(num < secondMin) secondMin = num;
            else if(num > secondMin) return true;
        }
        return false;
    }
	
	public static void main(String[] args) {
		System.out.println(TripletSubSequence.increasingTriplet( new int[]{1,2,3,4,5}));
		System.out.println(TripletSubSequence.increasingTriplet( new int[]{5,4,3,2,1}));
		System.out.println(TripletSubSequence.increasingTriplet( new int[]{2,4,-2,-3}));
		System.out.println(TripletSubSequence.increasingTriplet( new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}));
		System.out.println(TripletSubSequence.increasingTriplet( new int[]{5,1,5,5,2,5,4}));
		System.out.println(TripletSubSequence.increasingTriplet( new int[]{1,1,1}));
	}
}
