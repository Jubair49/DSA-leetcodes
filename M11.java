package practise_app4;
import java.util.*;
//You are given a string s, which contains stars *.
//In one operation, you can:
//Choose a star in s.
//Remove the closest non-star character to its left, as well as remove the star itself.
//Return the string after all stars have been removed.
//Note:
//The input will be generated such that the operation is always possible.
//It can be shown that the resulting string will always be unique.
//Example 1:
//Input: s = "leet**cod*e"
//Output: "lecoe"
//Explanation: Performing the removals from left to right:
//- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
//- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
//- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
//There are no more stars, so we return "lecoe".
public class M11 {
	public static void main(String[] args) {
		M11 obj =new M11();
		String s="leet**cod*e";
		System.out.println(obj.removeStar(s));
		
	}
	public String removeStar(String s) {
		Stack<Character> stack = new Stack<Character>();
		char c1;
		for(int i=0;i<s.length();i++) {
			c1= s.charAt(i);
			stack.push(c1);
			if(c1=='*') {
				stack.pop();
				char lastChar=stack.pop();
			}
		}
		StringBuffer obj = new StringBuffer();
		for(int i=0;i<stack.size();i++) {
			obj.append(stack.get(i));
		}
		return obj.toString();
	}
}
		
		
	
//		int index;
//		while((index=s.indexOf("*"))!=-1){
//			s=s.substring(0,index-1)+s.substring(index+1);
//		}
//		return s;
//	}
//}
			
	