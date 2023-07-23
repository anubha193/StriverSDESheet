package learn_the_Basic;
import java.util.*;
public class Functions {
	static int Maximum(int x, int y)
	{
		// Write your code here.
		if(x>y)
		return x;
		return y;
	}
	static void Swap(int x, int y)
	{
		// Write your code here.
		int c=x;
		x=y;
		y=c;
	}
	public static void main(String[] args)
	{
		int test, a, b, r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice=");
		test=sc.nextInt();
		System.out.println("Enter first value=");
		a=sc.nextInt();
		System.out.println("Enter second value=");
		b=sc.nextInt();
		switch(test)
		{
		case 1:
			r = Maximum(a, b);
			System.out.println("the maximum number is="+r);
			break;
		case 2:
			Swap(a, b);
			System.out.println("After swapping="+a+" and "+b);
			break;
		}
	}
}
