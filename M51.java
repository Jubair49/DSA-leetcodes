package practise_app4;
//fibonacci of a number by using recursion
public class M51 {
	public static void main(String[] args) {
		int fib1=fib(5);
		System.out.println(fib1);
	}
	static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
}