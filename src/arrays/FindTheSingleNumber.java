package arrays;

public class FindTheSingleNumber {
	 public static int getSingleElement(int []arr){
	       int x=0;
	       for(int i=0;i<arr.length;i++)
	       {
	           x=x^arr[i];
	       }
	       return x;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,2,3,3,4,5,5};
		System.out.println("the Single Number is="+getSingleElement(arr));

	}

}
