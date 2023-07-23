package learn_the_Basic;
import java.util.*;
public class CheckPalindrom {
	static boolean palindrome(int x)
	{
	    int num=x;
	         int a=0;
	         int rev=0;
	         if(x<0)return false;
	         while(x!=0)
	         {
	         a=x%10;
	         rev=rev*10+a;
	         x=x/10;
	         }
	         if(rev==num)return true;
	         return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number=");
		int n=sc.nextInt();
		if(palindrome(n))
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");

	}

}
