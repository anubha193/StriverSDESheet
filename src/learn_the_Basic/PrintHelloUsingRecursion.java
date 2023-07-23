package learn_the_Basic;
import java.util.*;
public class PrintHelloUsingRecursion {
	public static void printNtimes(int n){
        // Write your code here.
        if(n==0)
        return;
        System.out.println("Coding Ninjas");
        printNtimes(n-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number=");
		int n=sc.nextInt();
		printNtimes(n);
	}

}
