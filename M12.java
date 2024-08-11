package practise_app4;

import java.util.Stack;

//You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
//We repeatedly make duplicate removals on s until we no longer can.
//Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique. 
//Example 1:
//Input: s = "abbaca"
//Output: "ca"
//Explanation: 
//For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
//Example 2:
//Input: s = "azxxzy"
//Output: "ay"
public class M12 {
	public static void main(String[] args) {
		String s= "abbaca";
		M12 obj = new M12();
		System.out.println(obj.removeDuplicate(s));
	}
	public String removeDuplicate(String s) {
		Stack<Character> stack = new Stack<Character>();
		char c1;
		for(int i=0;i<s.length();i++) {
			c1=s.charAt(i);
			if(!stack.isEmpty() && stack.peek()==c1){
				stack.pop();
				continue;
			}
			stack.push(c1);
		}
		StringBuffer sb = new StringBuffer();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		s=sb.reverse().toString();
		return s;
		
	}
}	
		