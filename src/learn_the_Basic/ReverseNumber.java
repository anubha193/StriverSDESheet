package learn_the_Basic;
import java.util.*;
public class ReverseNumber {
	public static long reverseBits(long n) {
		// Write your code here
		 long bit = -1;
         int i =0;
        long dec = 0;
        while(n>0){
            bit=n%2;
               n/=2;
           dec = dec+ bit*(long)Math.pow(2, (31-i));
         i++;
          }

        return dec;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number=");
		int n=sc.nextInt();
		System.out.println("After reverse all the bit of the given number,the new number id="+reverseBits(n));

	}

}
