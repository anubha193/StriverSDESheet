package learn_the_Basic;
import java.util.*;
public class FibbonacciNumber {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number=");
		int n = sc.nextInt();
		int first = 1;
        int second = 1;

        if(n == 1 || n == 2) {
            System.out.println("the "+n+"th fibbonaci number is="+first);
        }
		else{
            for(int i = 3; i <= n; i++) {
                int nthTerm = first + second;
                first = second;
                second = nthTerm;
            }
            System.out.println("the "+n+"th fibbonaci number is="+second);
        }
	}

}
