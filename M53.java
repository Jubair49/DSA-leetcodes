package practise_app4;
//Write an algorithm to determine if a number n is happy.
//A happy number is a number defined by the following process:
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.
//Example 1:
//Input: n = 19
//Output: true
//Explanation:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
//Example 2:
//Input: n = 2
//Output: false
 
import java.util.ArrayList;ly 
import java.util.List;

public class M53 {
	public static void main(String[] args) {
		int n=2;
		M53 obj = new M53();
		System.out.println(obj.isHappy(n));
		
	}
	public boolean isHappy(int n) {
		List<Integer>list=new ArrayList<Integer>();
		while(n!=1 && !list.contains(n)) {
			list.add(n);
			int sum=0;
			int digit;
			while(n!=0) {
				digit=n%10;
				sum=sum+(digit*digit);
				n=n/10;
			}
			n=sum;
		}
		if(n==1) {
			return true;
		}
		else {
			return false;
		}
	}
}
//		
//		while(n!=1) {
//			int sum=0;
//			int digit;
//			while(n!=0) {
//				digit=n%10;
//				sum=sum+(digit*digit);
//				n=n/10;
//			}
//			n=sum;
//		}
//		