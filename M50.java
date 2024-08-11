package practise_app4;
//by using recursion factorial of a number........
public class M50 {
	public static void main(String[] args) {
		int fact1=fact(5);
		System.out.println(fact1);
	}
	static int fact(int i) {
		if(i==1) {
			return i;
		}
		return (i*fact(i-1));
	}
}
