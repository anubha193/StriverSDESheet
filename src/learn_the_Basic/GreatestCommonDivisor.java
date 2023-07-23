package learn_the_Basic;
import java.util.*;
public class GreatestCommonDivisor {
   static int gcd1(int a,int b)
   {
	   int ans=0;
	  for(int i=Math.min(a, b);i>=0;i--)
	  {
		  if(a%i==0 && b%i==0)
		  {
			ans=i;
			break;
		  }
	  }
	   return ans;
   }
   static int gcd2(int a,int b)
   {
	   if (b == 0) {
		      return a;
		    }
		    return gcd2(b, a % b); 
   }
   static int gcd3(int a,int b)
   {
	   if (b == 0) {
		      return a;
		    }
	   if(a>b)
		    return gcd3(b, a - b);
	   return gcd3(b,b-a);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a=");
		int a=sc.nextInt();
		System.out.println("Enter the value of b=");
		int b=sc.nextInt();
		System.out.println(gcd1(a,b));
		System.out.println(gcd2(a,b));
		System.out.println(gcd3(a,b));

	}

}
