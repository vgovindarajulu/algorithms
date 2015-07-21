package org.vj.algorithms.string.compression;

/**
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become
 * a2blc5a3. If the "compressed" string would not become smaller than the original
 * string, your method should return the original string.
 * @author vijay
 *
 */
public class CompressRepeatedCount {
	public static void main(String[] args) {
		String toCompress= "aabcccccaaa";
		System.out.println(new CompressRepeatedCount().compress(toCompress));
		
		toCompress= "abca";
		System.out.println(new CompressRepeatedCount().compress(toCompress));
	}
	public String compress(String toCompress){
		char[] charArray = toCompress.toCharArray();
		StringBuffer compressed = new StringBuffer();
		int count = 1 ;
		char previous = 0 ;
		for(int i = 0 ; i < charArray.length ; i++){
			
			if(previous == charArray[i]){
				count ++;
				if(charArray.length == i+1 ){
					compressed.append(previous+""+count);
				}
				continue;
			}else{
				if(previous != 0 && count != 1)
					compressed.append(previous+""+count);
				if(count == 1)
					compressed.append(previous+"");
				count = 1;
				previous = charArray[i];
			}
		}
		if(charArray.length == compressed.toString().toCharArray().length)
			return toCompress;
		else 
			return compressed.toString();
	}

}
