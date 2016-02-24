package org.interview.leetcode;

import java.util.Stack;

/**
 * Reverse Polish Notation
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators are +, -, *, /. 
 * Each operand may be an integer or another expression. For example:

 *  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 *  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 *  
 * @author vijay
 *
 */
public class RPN {
	public int rpn(String[] exp){
		Stack<String> stack = new Stack<String>();
		for(String entry : exp){
			switch(entry){
				case "+" :
					
					break;
				case "-" :
					break;
				case "*" :
					break;
				case "?" :
					break;
				default :
			}
		}
		return 0;
	}
}
