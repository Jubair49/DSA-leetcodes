package practise_app4;

import java.util.Arrays;
import java.util.Stack;

//Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
//Example 1:
//Input: temperatures = [73,74,75,71,69,72,76,73]
//Output: [1,1,4,2,1,1,0,0]
//Example 2:
//Input: temperatures = [30,40,50,60]
//Output: [1,1,1,0]
//Example 3:
//Input: temperatures = [30,60,90]
//Output: [1,1,0]
public class M13 {
	public static void main(String[] args) {
		M13 obj= new M13();
		int [] nums= {73,74,75,71,69,72,76,73};
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(obj.dailyTemperatures(nums)));
		
	}
	public  static int[] dailyTemperatures(int[] temperature) {
		int[]ans=new int[temperature.length];
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<temperature.length;i++) {
			while(!stack.isEmpty() && temperature[i]> temperature[stack.peek()]) {
				ans[stack.peek()]=i-stack.peek();
				stack.pop();
			}
			stack.push(i);
		}
		return ans;
	}
}