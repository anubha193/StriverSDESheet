package learn_the_Basic;
import java.util.*;
public class UserInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any chararcter=");
        char str = sc.next().charAt(0);
        if(Character.isUpperCase(str))
        System.out.println("1");
        else if(Character.isLowerCase(str))
        System.out.println("0");
        else
        System.out.println("-1");

	}

}
