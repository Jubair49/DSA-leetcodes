package practise_app4;
//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//Example 1:
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//Example 2:
//
//Input: strs = [""]
//Output: [[""]]

//import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class M9 {
	public static void main(String[] args) {
		M9 obj = new M9();
		String[] str= {"eat","tea","tan","ate","nat","bat"};
		System.out.println(obj.groupAnagaran(str));
	}
	public List<List<String>> groupAnagaran(String[]str){
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		String strs,sortedStr;
		for(int i=0;i<str.length;i++) {
			strs=str[i];
			sortedStr=sortedConted(strs);
			if(map.containsKey(sortedStr)) {
				map.get(sortedStr).add(strs);
			}
			else {

				ArrayList<String> list = new ArrayList<String>();
				list.add(strs);
				map.put(sortedStr,list);
			}
			
		}
		List<List<String>> list= new ArrayList<List<String>>(map.values());
		return list;
	}			
	private String sortedConted(String strs) {
		char[] chars=strs.toCharArray();
		Arrays.sort(chars);
		strs=new String(chars);
		return strs;
		
	}
}
