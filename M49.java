package practise_app4;
//reversing a string by using recursion
public class M49 {
	public static void main(String[] args) {
		String s1="abcd";
		System.out.println("initial:"+s1);
		s1=reverse(s1);
		System.out.println("final:"+s1);
		
	}
	public static String reverse(String s1) {
		if(s1.length()==1) {
			return s1;
		}
		return s1.charAt(s1.length()-1)+ reverse(s1.substring(0,s1.length()-1));
	}
}

