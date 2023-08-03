package arrays;

import java.util.Scanner;

public class LinearSearch {
     static int search(int arr[],int n,int k)
     {
    	 for(int i=0;i<n;i++)
    	 {
    		 if(k==arr[i])
    			 return i;
    	 }
    	 return -1;
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
        System.out.println("Enter the element you wanna search=");
        int k=sc.nextInt();
        int ans=search(arr,n,k);
        if(ans==-1)
        	System.out.println("Element is not present in array");
        else
        	System.out.println("element "+k+" present at index "+(ans+1));

	}

}
