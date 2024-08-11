package practise_app4;
//recursive algorith............
public class M45 {
	public static void main(String[] args) {
		System.out.println("main begin");
		test(5);
		System.out.println("main end");
	}
		
		

	static void test(int i) {
		System.out.println("test:"+i);
		if(i==2) {
			return ;
		}
		i--;
		test(i);
	}
}