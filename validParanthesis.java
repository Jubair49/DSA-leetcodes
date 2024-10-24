package app1;

import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
// 
//
//Example 1:
//
//Input: s = "()"
//
//Output: true
//
//Example 2:
//
//Input: s = "()[]{}"
//
//Output: true
//
//Example 3:
//
//Input: s = "(]"
//
//Output: false
//
//Example 4:
//
//Input: s = "([])"
//
//Output: true
public class validParanthesis {
	public static void main(String[] args) {
		String s="()";
		System.out.println(isValid(s));
		
	}
	public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
		char c1;
		boolean flag =true;
		for(int i=0;i<s.length();i++) {
			c1=s.charAt(i);
			if(c1=='(' || c1=='[' || c1=='{') {
				stack.push(c1);
			}
			else if(stack.size()!=0) {
				char lastChar = stack.pop();
				if((c1==')' && lastChar !='(') ||
				   (c1==']' && lastChar !='[') ||
				   (c1=='}' && lastChar !='{')) {
				   flag=false;
				   break;
				}
			}
			else {
				flag=false;
				break;
            }
        }
        if(stack.size()!=0){
            flag=false;
        }
            
		return flag;
	}
	
}

	

