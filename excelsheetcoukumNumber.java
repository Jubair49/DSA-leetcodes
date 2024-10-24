package app1;

import java.util.Scanner;

//Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
//For example:
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28 
//Example 1:
//Input: columnTitle = "A"
//Output: 1
//Example 2:
//Input: columnTitle = "AB"
//Output: 28
//Example 3:
//Input: columnTitle = "ZY"
//Output: 701

public class excelsheetcoukumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of s");
		String columnTitle=sc.next();
		System.out.println(titleToNumber(columnTitle));
	}
	public static int titleToNumber(String columnTitle) {
		int result=0;
		char[]c =columnTitle.toCharArray();
		for(int i=0;i<c.length;i++) {
			int num=c[i]-65+1;
			result=result*26+num;
		}
		return result;
	}
}
