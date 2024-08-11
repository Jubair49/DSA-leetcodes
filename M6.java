package practise_app4;

import java.util.HashMap;

//longet sun string(its length......)
public class M6 {
	public static void main(String[] args) {
		String s="abcbcadeb";
		M6 obj = new M6();
		System.out.println(obj.lengthStringss(s));
		
	}
	public int lengthStringss(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int i=0;
		int j=0;
		char c1;
		int max=0;
		for( i=0;i<s.length();i++) {
			c1=s.charAt(i);
			if(map.containsKey(c1)) {
				max =Math.max(max,i-j);
				while(map.containsKey(c1)) {
					map.remove(s.charAt(j));
					j++;
				}
			}
			map.put(c1, i);
		}
		max=Math.max(max, i-j);
		return max;
	}
}
		
				