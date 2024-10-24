package app1;
//https://leetcode.com/problems/word-pattern/
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Given a pattern and a string s, find if s follows the same pattern.
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
//Each letter in pattern maps to exactly one unique word in s.
//Each unique word in s maps to exactly one letter in pattern.
//No two letters map to the same word, and no two words map to the same letter
//Example 1:
//Input: pattern = "abba", s = "dog cat cat dog"
//Output: true
//Explanation:
//The bijection can be established as:
//'a' maps to "dog".
//'b' maps to "cat".
//Example 2:
//Input: pattern = "abba", s = "dog cat cat fish"
//Output: false
//Example 3:
//Input: pattern = "aaaa", s = "dog cat cat dog"
//Output: false
public class wotrdPttern {
	public static void main(String[] args) {
		String pattern="abba";
		String s="dog cat cat dog";//dog dog dog dog
		System.out.println(wordPattern(pattern,s));
		
	} 
	public static  boolean wordPattern(String pattern, String s) {
		String[]arr=s.split(" ");
		if(pattern.length()!=arr.length) {
			return false;
		}
        Set<String> set=new HashSet<String>();
		HashMap<Character, String> map =new HashMap<Character, String>();
		for(int i=0;i<pattern.length();i++) {
            String word=arr[i];
			char c=pattern.charAt(i);
			if(map.containsKey(c)) {
				if(!map.get(c).equals(word)) {
					return false;
				}
			}
			else {
				if(set.contains(word)) {	
					return false;
				}
                else{
				   map.put(c, word);
                   set.add(word);
                }
			}
		}
		return true;
	}
}
		/*String[]word=s.split(" ");
		if(pattern.length()!=word.length) {
			return false;
		}
		HashMap<Character, String> map =new HashMap<Character, String>();
		for(int i=0;i<pattern.length();i++) {
			char c=pattern.charAt(i);
			if(map.containsKey(c)) {
				if(!map.get(c).equals(word[i])) {
					return false;
				}
			}
			else {
				if(map.containsKey(word[i])) {	
					return false;
				}
				map.put(c, word[i]);
			}
		}
		return true;*/
