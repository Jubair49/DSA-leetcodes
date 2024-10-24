package app1;
//https://leetcode.com/problems/concatenated-words/description/
//Given an array of strings words (without duplicates), return all the concatenated words in the given list of words.
//A concatenated word is defined as a string that is comprised entirely of at least two shorter words (not necessarily distinct) in the given array
//Example 1:\
//Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
//Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
//Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats"; 
//"dogcatsdog" can be concatenated by "dog", "cats" and "dog"; 
//"ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
//Example 2:
//
//Input: words = ["cat","dog","catdog"]
//Output: ["catdog"]
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class concateString {
	public static void main(String[] args) {
		String[] words= {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
		System.out.println(findAllConcatenatedWordsInADict(words));
		
	}
	public static List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashMap<String,Boolean> map = new HashMap<>();
        Set<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            set.add(word);
        }
        List<String> result= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(isConcat(words[i],set,map)){
                result.add(words[i]);
            }
        }
        return result;
    }
    public static boolean isConcat(String word,Set<String> set,HashMap<String,Boolean> map){
        if(map.containsKey(word)){
            return map.get(word);
                
        }
        for(int i=0;i<word.length();i++){
            String prefix=word.substring(0,i+1);
            String suffix=word.substring(i+1,word.length());
            if(set.contains(prefix)&& set.contains(suffix) || set.contains(prefix) && isConcat(suffix,set,map)){
                map.put(word,true);
                return true;
            }
        }
        map.put(word,false);
        return false;
    }
}

