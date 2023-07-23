package learn_the_Basic;
import java.util.*;
public class StringPalindrome {
	public static boolean isPalindrome(String s) { 
        // Write your code here
        String str=s.replaceAll(" ","");
        System.out.println(str);
        return palindrome(0,str.length()-1,str);
    }
	static boolean palindrome(int start,int end,String str)
    { 
       if(start<=end){
            if(Character.isLetterOrDigit(start) && Character.isLetterOrDigit(end)){
        if(str.charAt(start)==str.charAt(end) && palindrome(start+1, end-1,str))
            return true;
            return false;
           }
        }
        return true;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="race a car";
		if(Character.)
		if(isPalindrome(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
