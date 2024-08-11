package practise_app4;

import java.util.HashMap;

public class M26 {
	public static void main(String[] args) {
		String s="aabbabbaccccbbaabcc";
		System.out.println(longestSubstringwithAtMostTwoChars(s));
	}
	static int longestSubstringwithAtMostTwoChars(String s) {
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		int leftpointer=0;
		int longestSubString=0;
		char c1;
		int i =0;
		
		for(  i=0;i<s.length();i++) {
			c1=s.charAt(i);
			map.put(c1,map.getOrDefault(c1,0)+1);
			if(map.size()>2) {
				System.out.println(("max count: "+(i-leftpointer)));
				longestSubString =Math.max(longestSubString,(i-leftpointer));
				while(map.size() >2) {
					c1=s.charAt(leftpointer);
					if(map.get(c1)>1) {
						map.put(c1,map.get(c1)-1);
					}
					else {
						map.remove(c1);
					}
					leftpointer++;
				}
			}   
		}
		System.out.println(("max count: "+(i-leftpointer)));
		longestSubString =Math.max(longestSubString,(i-leftpointer));
		return longestSubString;
	}
}