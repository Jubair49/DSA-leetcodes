package practise_app4;

import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//Example 1:
//Input: s = "()"
//Output: true
//Example 2:
//Input: s = "()[]{}"
//Output: true
//Example 3:
//Input: s = "(]"
//Output: false
public class M10 {
	public static void main(String[] args) {
		String s="(){}[][";
		M10 obj = new M10();
		System.out.println(obj.validParanthesis(s));
	}
	public boolean validParanthesis(String s) {
		Stack<Character> stack = new Stack<Character>();
		boolean flag=true;
		char c1;
		for(int i=0;i<s.length();i++) {
			c1=s.charAt(i);
			if(c1=='(' || c1=='{' || c1=='[') {
				stack.push(c1);
			}
			else if(stack.size()!=0) {
				char lastChar=stack.pop();
				if(c1==')' && lastChar!='('||
				  (c1=='}' && lastChar!='{'||
				  (c1==']' && lastChar!='['))){
					flag=false;
				}
			}
			else {
				flag=false;
				break;
			}
		}
		if(!stack.isEmpty()) {
			flag =false;
		}
		return flag;
	}
}
					