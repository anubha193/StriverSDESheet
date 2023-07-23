package learn_the_Basic;
import java.util.*;
public class SwitchStatment {
	 public static double areaSwitchCase(int ch, double []a) {
	        // Write your code here
	         double area = 0.0;
	        switch(ch){
	            case 1: 
	                area = Math.PI*a[0]*a[0];
	                break;
	            case 2:
	                area=a[0]*a[1];
	                break;
	        }
	        return area;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice=");
		int ch=sc.nextInt();
		double arr[]=new double[2];
		while(true)
		{
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter the radius of circle=");
				arr[0]=sc.nextInt();
				System.out.println("The area of circle is="+areaSwitchCase(ch,arr));
				};
				break;
			case 2:
			{
				System.out.println("Enter the height=");
				arr[0]=sc.nextInt();
				System.out.println("enter the width=");
				arr[1]=sc.nextInt();
				System.out.println("The area of ractangle is="+areaSwitchCase(ch,arr));
			}
			break;
			}
		}
		

	}

}
