package practise_app4;
//recursion printing elements from 1 to 10 with out using for loop
public class M47 {
	public static void main(String[] args) {
		test(1);
		
	}
	static void test(int i) {
		System.out.println(i);
		if(i==10) {
			return;
			
		}
		i++;
		test(i);
		
	}
}


//printing from 10 to  1
//public static void main(String[] args) {
//	test(10);
//	
//}
//static void test(int i) {
//	System.out.println(i);
//	if(i==1) {
//		return;
//		
//	}
//	i--;
//	test(i);
//	System.out.println(i);
//}
//}
		