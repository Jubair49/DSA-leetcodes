package app1;
//https://leetcode.com/problems/isomorphic-strings/description/
//Given two strings s and t, determine if they are isomorphic.
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
//Example 1:
//Input: s = "egg", t = "add"
//Output: true
//Explanation:
//The strings s and t can be made identical by:
//Mapping 'e' to 'a'.
//Mapping 'g' to 'd'.
//Example 2:
//Input: s = "foo", t = "bar"
//Output: false
//Explanation:
//The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
//Example 3:
//Input: s = "paper", t = "title"
//Output: true

import java.util.HashMap;

public class isoMorphicString {
	public static void main(String[] args) {
		String s="paper";
		String t="title";
		isoMorphicString obj = new isoMorphicString();
;		System.out.println(obj.isIsomorphic(s,t));
		
		
	}
	public  boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i)))
			{
				if(map.get(s.charAt(i))!=t.charAt(i)) {
					return false;
				}
				
			}
			else {
				if(map.containsValue(t.charAt(i)))
				{
					return false;
					
				}
				map.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	
	}
}
	