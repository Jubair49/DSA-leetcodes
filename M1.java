package practise_app4;
//Given a string s consisting of lowercase English letters, return the first letter to appear twice
//A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
//s will contain at least one letter that appears twice
//Example 1:
//Input: s = "abccbaacz"
//Output: "c"
//Explanation:
//The letter 'a' appears on the indexes 0, 5 and 6.
//The letter 'b' appears on the indexes 1 and 4.
//The letter 'c' appears on the indexes 2, 3 and 7.
//The letter 'z' appears on the index 8.
//The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
//Example 2:
//Input: s = "abcdd"
//Output: "d"
//Explanation:
//The only letter that appears twice is 'd' so we return 'd'.
import java.util.HashMap;
public class M1 {
	public static void main(String[] args) {
		M1 obj = new M1();
		String s="abcabbc";
		System.out.println(obj.repeatedChar(s));
	}
	public char repeatedChar(String s) {
		char c1=s.charAt(0);
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			c1=s.charAt(i);
			map.put(c1, map.getOrDefault(c1,0)+1);
			if(map.get(c1)==2) {
				break;
			}
		}
		return c1;
	}
}
	