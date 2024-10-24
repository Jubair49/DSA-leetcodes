package app1;
//https://leetcode.com/problems/reverse-vowels-of-a-string/description/
//Given a string s, reverse only all the vowels in the string and return it.
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//Example 1:
//Input: s = "IceCreAm"
//Output: "AceCreIm"
//Explanation:
//The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
//Example 2:
//Input: s = "leetcode"
//Output: "leotcede"
public class reverseVowelsOfString {
	public static void main(String[] args) {
		String s="IceCreAm";
		System.out.println(reverseVowels(s));
		
	}
	public static  String reverseVowels(String s) {
		int n=s.length();
		char[]c=s.toCharArray();
		int l=0;
		int r=s.length()-1;
		while(l<r) {
			if(!isVowel(c[l])) {
				l++;
			}
			else if(!isVowel(c[r])) {
				r--;
			}
			else {
				char temp=c[l];
				c[l]=c[r];
				c[r]=temp;
				l++;
				r--;
				
			}
			
		}
		return String.valueOf(c);
	}
	
	private static boolean isVowel(char c) {
		if(c=='a'|| c=='e' || c=='i'||c=='o'|| c=='u'||c=='A' ||c=='E'||c=='I'||c=='O' ||c=='U') {
			return true;
		}
		return false;
		
	}
}