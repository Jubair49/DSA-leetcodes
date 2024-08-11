package practise_app4;
//sum of two numbers by using recursion
public class M48 {
	public static void main(String[] args) {
		int sum=test(5);
		System.out.println(sum);
		
	}
	static int test(int i) {
		if(i==0) {
			return 0;
		}
		return (i+test(i-1));
	}
}
