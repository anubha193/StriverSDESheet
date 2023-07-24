package learn_the_Basic;
import java.util.*;
public class FibonacciNumberRecursion {
     static int fibbo(int n)
     {
    	 if(n==0)return 0;
    	 if(n==1 || n==2)return 1;
    	 return fibbo(n-1)+fibbo(n-2);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number=");
		int n=sc.nextInt();
		System.out.println("the "+n+"th fibbonaci number is "+fibbo(n));

	}

}
