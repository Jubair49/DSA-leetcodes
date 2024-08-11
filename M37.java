package practise_app4;
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//
// 
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
////Since an empty string reads the same forward and backward, it is a palindrome.
 
public class M37 {
	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		M37 obj = new M37();
		System.out.println(obj.isPalindrome(s));
	}
	public boolean isPalindrome(String s) {
		String value="";
		char c;
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			if(Character.isDigit(c)|| Character.isLetter(c)) {
				value+=c;
			}
		}
		value =value.toLowerCase();
		int i=0;
		int j=value.length()-1;
		while(i<=j) {
			if(value.charAt(i)!=value.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}