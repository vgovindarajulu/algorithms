package org.interview.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.annotation.Generated;

public class WordLadder {
	
	public List<String> ladderLength(String start, String end, Set<String> dict) {  
	    if(start==null || end==null || start.length()==0 || end.length()==0 || start.length()!=end.length())  
	        return Collections.emptyList();  
	    
	    LinkedList<String> queue = new LinkedList<String>();  
	    HashSet<String> visited = new HashSet<String>();  
	    List<String> ladder = new ArrayList<String>();
	    ladder.add(start);
	    int level= 1;  
	    int lastNum = 1;  
	    int curNum = 0;  
	    queue.offer(start);  
	    visited.add(start);  
	    
	    while(!queue.isEmpty())  
	    {  
	        String cur = queue.poll();  
	        lastNum--;  
	        for(int i=0;i<cur.length();i++)  
	        {  
	            char[] charCur = cur.toCharArray();  
	            for(char c='a';c<='z';c++)  
	            {  
	                charCur[i] = c;  
	                String temp = new String(charCur);  
	                if(temp.equals(end))  {
	                	ladder.add(end);
	                	return ladder;
	                }
	                if(dict.contains(temp) && !visited.contains(temp))  
	                {  
	                    curNum++;  
	                    queue.offer(temp);  
	                    visited.add(temp);
	                    ladder.add(temp);
	                }  
	            }  
	        }  
	        if(lastNum==0)  
	        {  
	            lastNum = curNum;  
	            curNum = 0;  
	            level++;  
	        }  
	    }  
	    return Collections.emptyList();  
	}  

    public static void main(String[] args) {
		System.out.println(new WordLadder().ladderLength("hit", "cog", new HashSet<String>(Arrays.asList("hot","dot","dog","lot","log"))));
	}
}
