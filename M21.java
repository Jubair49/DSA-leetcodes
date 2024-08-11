package practise_app4;
//15 and 16 solution.........assignment question..
import java.util.ArrayList;

public class M21 {
	public static void main(String[] args) {
		System.out.println(removeStar("abc*test"));
		System.out.println(removeStarWithLeftChar("abc*test"));
		System.out.println(removeStarLeftAndRightChar("abc*test"));
	}
	static String removeStar(String s) {
		ArrayList<Character> list=new ArrayList<Character>();
		char c1;
		for(int i=0;i<s.length();i++) {
			c1=s.charAt(i);
			if(c1!='*') {
				list.add(s.charAt(i));
			}
		}
		String result="";
		for(int i=0;i<list.size();i++) {
			result+=list.get(i);
		}
		return result;
	}
	static String removeStarWithLeftChar(String s) {
		ArrayList<Character> list=new ArrayList<Character>();
		char c1=s.charAt(0);
		list.add(c1);
		for(int i=1;i<s.length();i++) {
			c1=s.charAt(i);
			if(c1=='*') {
				if(list.get(list.size()-1)!='*') {
					list.remove(list.size()-1);
				}
				continue;
			}
			list.add(s.charAt(i));
		}
				
		String result="";
		for(int i=0;i<list.size();i++) {
			result+=list.get(i);
		}
		return result;
	}
	static String removeStarLeftAndRightChar(String s) { 
		ArrayList<Character> list=new ArrayList<Character>();
		if(s.length()==0) {
			return s;
		}
		char c1=s.charAt(0);
		list.add(c1);
		for(int i=1;i<s.length();i++) {
			c1=s.charAt(i);
			if(c1=='*') {
				if(list.get(list.size()-1)!='*') {
					list.remove(list.size()-1);
				}
				if(i<s.length() && s.charAt(i+1)!='*') {
					i++;
				}
				continue;
			}
			list.add(s.charAt(i));
		}
				
		String result="";
		for(int i=0;i<list.size();i++){
			
			result+=list.get(i);
		}
		return result;
	}
}	
		
		

//		String s="hello*test";
//		int index;
//		while((index=s.indexOf("*"))!=-1) {
//			s=s.substring(0,index-1)+s.substring(index+1);
//			System.out.println(s);
//		}
//	}
//}