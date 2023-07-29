package arrays;

import java.util.Scanner;

public class LargestElementInArray {
    static int largest(int []arr,int n)
    {
    	int max=arr[0];
    	for(int i=1;i<n;i++)
    	{
    	if(max<arr[i])
    		max=arr[i];
    	}
    	return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array=");
        for(int i=0;i<n;i++)
        	arr[i]=sc.nextInt();
        System.out.println("the Array elements is=");
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("The Largest Element of array is="+largest(arr,n));

	}

}
