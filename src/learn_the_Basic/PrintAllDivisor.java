package learn_the_Basic;
import java.util.*;
public class PrintAllDivisor {
	 public static int sumOfAllDivisors(int n){
	        // Write your code here.
	      int ans = 0;
	        for(int i=1; i<=n; i++)
	            ans += i*(n/i);
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number=");
		int n=sc.nextInt();
		System.out.println("The sum of divisor is="+sumOfAllDivisors(n));

	}

}
