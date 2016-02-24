package org.interview.leetcode;

import java.util.HashMap;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.

 *	The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
	
 *	You may assume that each input would have exactly one solution.
	
 *	Input: numbers={2, 7, 11, 15}, target=9
 *	Output: index1=1, index2=2

 * @author vijay
 *
 */
public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
	 
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index+1 ;
				result[1] = i+1;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}
	 
		return result;
	    }
    
    public static void main(String[] args) {

		int[] nums = new int[]{0,4,3,0};
		int[] sols = new TwoSum().twoSum(nums, 0);
		System.out.println(sols[0] +" , "+ sols[1]);
	}
}