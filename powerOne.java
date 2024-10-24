package app1;
//Given an integer n, return true if it is a power of two. Otherwise, return false.
//
//An integer n is a power of two, if there exists an integer x such that n == 2x.
//Example 1:
//Input: n = 1
//Output: true
//Explanation: 20 = 1
//Example 2:
//Input: n = 16
//Output: true
//Explanation: 24 = 16
//Example 3:
//Input: n = 3
//Output: false
import java.util.Scanner;
public class powerOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println(isPowerOfTwo(n));
	}
	public  static boolean isPowerOfTwo(int n) {
        int i=1;
        while(i<n){
            i=i*2;
        }
        if(i==n) {
        	return true;
        }
        else {
        	return false;
        }
	}
}
 