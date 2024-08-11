package practise_app4;
//remove triplets.......
import java.util.ArrayList;

public class M22 {
	public static void main(String[] args) {
		System.out.println(removeTriplets("aaabbcxxxyyzbbcca"));
		System.out.println(removeTriplets("aabbcxxyytzbbccappppqrsss"));
		
	}
	static String removeTriplets(String s) {
		if(s.length()==0) {
			return s;
			
		}
		ArrayList<Character> list=new ArrayList<Character>();
		char c1;
		for(int i=0;i<s.length()-1;i++) {
			c1=s.charAt(i);
			
			if(list.size()>0  && list.get(list.size()-1) == c1 && c1==s.charAt(i+1)) {
				list.remove(list.size()-1);
				i++;
				continue;
			}
			list.add(c1);
		}
		String result="";
		for(int i=0;i<list.size();i++) {
			result+=list.get(i);
		}
		return result;
	}
}