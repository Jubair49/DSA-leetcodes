package practise_app4;

import java.util.HashMap;

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//Example 1:
//Input: s = "leetcode"
//Output: 0
//Example 2:
//Input: s = "loveleetcode"
//Output: 2
public class M2 {
	public static void main(String[] args) {
		M2 obj = new M2();
		String s="eettccoodde";
		System.out.println(obj.uniqueChar(s));
		
	}
	public int uniqueChar(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int index=-1;
		
		char c1;
		for(int i=0;i<s.length();i++) {
			c1=s.charAt(i);
			map.put(c1,map.getOrDefault(c1, 0)+1);
		}
		for(int i=0;i<s.length();i++) {
			c1=s.charAt(i);
			if(map.get(c1)==1) {
				index=i;
				break;
			}
		}
		return index;
	}
}
