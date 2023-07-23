package learn_the_Basic;
import java.util.*;
public class CountDigit {
	public static int countDigits(int n){
        // Write your code here.
        int count=0;
        int original=n;
        int out=0;
        while(n!=0)
        {
        out=n%10;
        if(out!=0 && original%out==0)
        count++;
        n=n/10;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number=");
		int n=sc.nextInt();
		System.out.println("the number of digit that evenlt divide the given="+countDigits(n));

	}

}
