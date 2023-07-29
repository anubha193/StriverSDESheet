package arrays;

import java.util.Scanner;

public class CheckIsArrayIsSorted {
    static boolean isSort(int arr[],int n)
    {
    	for(int i=1;i<n;i++)
    	{
    		if(arr[i-1]>arr[i])
    			return false;
    	}
    	return true;
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
      if(isSort(arr,n))
    	  System.out.println("Array is sorted");
      else
    	  System.out.println("Array is not sorted");

	}

}
