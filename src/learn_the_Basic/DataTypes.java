package learn_the_Basic;
import java.util.*;
public class DataTypes {
	  public static int dataTypes(String type) {
	        // Write your code here
	        if(type.equals("Integer"))
	        return 4;
	        else if(type.equals("Long"))
	         return 8;
	        else if(type.equals("Float"))
	       return 4;
	        else if(type.equals("Double"))
	       return 8;
	        else if(type.equals("Character"))
	       return 1;
	       return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any data type=");
		String str=sc.nextLine();
		System.out.println("the size of data type in bytes is="+dataTypes(str));

	}

}
