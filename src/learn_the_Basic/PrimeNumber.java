package learn_the_Basic;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= Math.sqrt(num); i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number=");
		int n=sc.nextInt();
		if(isPrime(n))
			System.out.println("prime");
		else 
			System.out.println("Not prime");

	}

}
