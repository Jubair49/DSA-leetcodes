package practise_app4;

import java.util.Arrays;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//Input: s = "rat", t = "car"
//Output: false
public class M7 {
	public static void main(String[] args) {
		M7 obj = new M7();
		String s="anagram";
		String t="nagaram";
		System.out.println(obj.validAnagram(s,t));
		
	}
	public  boolean validAnagram(String s,String t) {
		char[] chars1=s.toCharArray();
		Arrays.sort(chars1);
		s= new String(chars1);
		char[] chars2=s.toCharArray();
		Arrays.sort(chars2);
		t= new String(chars2);
		boolean flag=s.equals(t);
		return flag;
	}
	
}
		
		