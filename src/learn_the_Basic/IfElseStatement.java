package learn_the_Basic;
import java.util.*;
public class IfElseStatement {
	public static String compareIfElse(int a, int b) {
        // Write your code here
        if(a<b)
        return "smaller";
        else if(a>b)
        return "greater";
        else
        return "equal";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareIfElse(30,64));

	}

}
