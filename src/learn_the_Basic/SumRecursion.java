package learn_the_Basic;
import java.util.*;
public class SumRecursion {
	static void print(int[] sum,int n)
    {
        if(n==0)return;
        sum[0]=sum[0]+n;
//        System.out.println(sum[0]);
        print(sum,n-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number=");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum[]=new int[1];
		sum[0]=0;
		print(sum,n);
		System.out.println(sum[0]);

	}

}
