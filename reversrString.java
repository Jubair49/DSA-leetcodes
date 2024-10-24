package app1;
import java.util.Arrays;
import java.util.Scanner;
public class reversrString {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Ebnter the values odf s");
		String s=sc.nextLine();
		String [] str=s.split(" ");
		System.out.println(Arrays.toString(str));
		int start=0;
		int end=str.length-1;
		while(start<end) {
			String temp=str[start];
			str[start]=str[end];
			str[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(str));
	}
}
	