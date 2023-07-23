package learn_the_Basic;
import java.util.*;
public class FactorialNumberNotGreaterThenCount {
	public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> list = new ArrayList<>();
        long res = 1;
        long count = 1;
        while(res <= n/count){
            res *= count;
            count++;
            list.add(res);
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number=");
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		System.out.println(factorialNumbers(n));
	}

}
