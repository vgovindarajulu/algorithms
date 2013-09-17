package org.interview.algorithms.bit;

public class CalculateParity {

	private static String calcuateParity(long x){
		long result = 0;
		  while (x != 0) {
//		    result ^= (x & 1);
		    result = result ^ (x & 1);
		    x >>= 1;
		  }
		  return result == 1 ? "odd" : "even";
	}
	public static void main(String[] args) {
		System.out.println("1 = "+calcuateParity(1l));
		System.out.println("3 = "+calcuateParity(3l));
		System.out.println("7 = "+calcuateParity(7l));
		System.out.println("21 = "+calcuateParity(21l));
		System.out.println("30 = "+calcuateParity(30l));
	}
}
