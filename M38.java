package practise_app4;
//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//Example 1:
//Input: s = "aba"
//Output: true
//Example 2:
//Input: s = "abca"
//Output: true
//Explanation: You could delete the character 'c'.
//Example 3:
//
//Input: s = "abc"
//Output: false
public class M38 {
	public static void main(String[] args) {
		String s="maadam";
		M38 obj = new M38();
		System.out.println(obj.isPalindrome(s));
	}
	public boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<=j && s.charAt(i)==s.charAt(j)) {
			i++;
			j--;
		}
		if(i>j) {
			return true;
		}
		
		return isPalindrome(s,i+1,j)||isPalindrome(s,i,j-1);
	}
		boolean isPalindrome(String s,int i,int j) {
			while(i<=j) {
				if(s.charAt(i)!=s.charAt(j)) {
					return false;
				}
				i++;
				j--;
			}
			return true;
		}
}