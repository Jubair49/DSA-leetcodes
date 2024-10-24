package app1;

public class palindrome {
	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));	
	}
    public static boolean isPalindrome(String s) {
    	
    	s=s.toLowerCase();
    	String str="";
    	for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=97 && s.charAt(i)<=122)|| (s.charAt(i)>=48 && s.charAt(i)<=57)){
                str+=s.charAt(i);
            }
        }
    	
    	int i=0;
    	int j=str.length()-1;
    	while(i<j) {
    		if(str.charAt(i)==str.charAt(j)) {
    			i++;
    			j--;
    		}
    		else {
    			return false;
    		}
    	}
    	return true;
    }
}
//    s=s.toLowerCase();
//	String str="";
//	for(int i=0;i<s.length();i++){
//        char c=s.charAt(i);
//        if(Character.isDigit(c)||Character.isLetter(c)){
//            str+=c;
//        }
//    }
//      
//	int i=0;
//	int j=str.length()-1;
//	while(i<=j) {
//		if(str.charAt(i)==str.charAt(j)) {
//			i++;
//			j--;
//		}
//		else {
//			return false;
//		}
//	}
//	return true;
//}
//}

    
  