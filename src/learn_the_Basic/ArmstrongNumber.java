package learn_the_Basic;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number=");
		int n =sc.nextInt();
		int num=n;
		int original=n;
		int count=0;
		while(n!=0)
		{
			count++;
          n=n/10;
		}
		int sum=0;
		int value=0;
		while(num != 0){
			int digit = num % 10;
			sum += Math.pow(digit, count);
			num = num / 10;
		}
		
       if(sum==original)
	   System.out.print(true);
	   else
	   System.out.print(false);

	}

}
