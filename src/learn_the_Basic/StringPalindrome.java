package learn_the_Basic;
import java.util.*;
public class StringPalindrome {
	public static boolean isPalindrome(String s) { 
        // Write your code here
		String str="";
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	if(Character.isDigit(ch) || Character.isLetter(ch))
        			str+=ch;
        	}
        System.out.println(str);
        return palindrome(0,str.length()-1,str.toLowerCase());
    }
	static boolean palindrome(int start,int end,String str)
    { 
       if(start<=end){
        if(str.charAt(start)==str.charAt(end) && palindrome(start+1, end-1,str))
            return true;
            return false;
        }
        return true;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, a plan, a canal: Panama";
		if(Character.isDigit(11))
			System.out.println("anubha");
		else
			System.out.println("rajput");
		if(isPalindrome(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
