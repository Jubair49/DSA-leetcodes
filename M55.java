package practise_app4;

import java.util.Scanner;

public class M55 {
	
	public static  void Table(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+(n*i));
			
		}
		//return n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		Table(n);
	}
}
		
	
//		int n=18;
//		M55 obj = new M55();
//		System.out.println(obj.multiTable(n));
//	}
//	public int multiTable(int n) {
//	
//		for(int i=1;i<=10;i++) {
//			System.out.println(n+"x"+i+"="+(n*i));
//		}
//		return n ;
//	}
//}
