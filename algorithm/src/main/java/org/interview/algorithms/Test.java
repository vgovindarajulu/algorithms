package org.interview.algorithms;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		BigDecimal  res = new BigDecimal(18).divide(new BigDecimal(15), RoundingMode.UP);
		int l = 18/15;
		System.out.println(l +" : "+res);
		Stack<Integer> stk = new Stack();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		stk.push(6);
		stk.push(7);
		stk.push(8);
		System.out.println(stk.peek());
		System.out.println(stk.peek());
		System.out.println(stk.peek());
		System.out.println(stk.peek());
		System.out.println(stk.get(stk.size()-1));
		System.out.println(stk.get(stk.size()-2));
		System.out.println(stk.get(stk.size()-3));
		List<String> asins = getAsinDump();
		System.out.println(asins.size());
		LinkedList<List<String>> bucs = buckerize(asins, 2);
		System.out.println(bucs.size());
		
		while(!bucs.isEmpty()){
			System.out.println(bucs.pop());

		}

		clean(asins);
		System.out.println(asins.size());
		List<String> duplicates = Arrays.asList("a","a","a","b","b","b","c","d","d","a");
		int i = 0;
		int s = 0;
		String temp = null;
		Map<String, Integer> a = new HashMap<String, Integer>();
		for(String dupes : duplicates){
			if(a.containsKey(dupes)){
				
				int aa = a.get(dupes);
				a.put(dupes, ++aa);
			}else{
				a.put(dupes, 1);
			}
		}
		System.out.println(a);
	}

	private static LinkedList<List<String>> buckerize(List<String> asins, int bucketSize) {
		int start = 0;
		int len = asins.size();
		LinkedList<List<String>> bucket = new LinkedList<List<String>>();
		int end = start + bucketSize;
		while(true){
			
			List<String> miniBucket = asins.subList(start, end);
			
			bucket.add(miniBucket);
			if(end == len){
				break;
			}
			start = end ;
			end = start + bucketSize;
			if (end > len){
				end = len;
			}
			
		}
		return bucket;
	}
	
	private static void clean(List<String> strings){
		Iterator<String> iter = strings.iterator();
		while(iter.hasNext()){
			String str = iter.next();
			iter.remove();
		}
	}

	private static List<String> getAsinDump() {
		List<String> asin = new ArrayList<String>();
		int i = 0;
		while(true){
			asin.add(String.valueOf(i));
			i++;
			if(i==37){
				break;
			}
		}
		return asin;
	}
}
