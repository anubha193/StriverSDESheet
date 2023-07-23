package learn_the_Basic;
import java.util.*;
public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int sum1=0;
		int sum2=0;
		int a=0;
		while(n!=0)
		{
			a=n%10;
			if(a%2==0)
			sum1+=a;
			else
			sum2+=a;
			n=n/10;

		}
		System.out.println(sum1+" "+sum2);

	}

}
