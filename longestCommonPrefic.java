package app1;
//https://leetcode.com/problems/longest-common-prefix/
import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/longest-common-prefix/
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//Example 1:
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

public class longestCommonPrefic {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String[]strs=s.split(" ");
		System.out.println(longestCommonPrefix(strs));
		
	}
	public static String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs);
		String s1=strs[0];
		String s2=strs[strs.length-1];
		int i=0;
		while(i<s1.length()){
			if(s1.charAt(i)==s2.charAt(i)) {
				i++;
			}
			else {
				break;
			}
		}
		if(i==0) {
			return "";
		}
		else {
			return s1.substring(0,i);
		}
	}
}