package practise_app4;
//using recursion
public class M46 {
	public static void main(String[] args) {
		System.out.println(1);
		test(10);
		System.out.println(2);
		
	}
	static void test(int i) {
		System.out.println(i);
		if(i==13) {
			return;
		}
		i++;
		test(i);
		System.out.println(i);
	}
}
