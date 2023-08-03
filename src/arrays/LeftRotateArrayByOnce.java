package arrays;

import java.util.Scanner;

public class LeftRotateArrayByOnce {
    static void replaceArray(int[] arr,int n)
    {
    	int num=arr[0];
    	for(int i=1;i<n;i++)
    		arr[i-1]=arr[i];
    	arr[n-1]=num;
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
        System.out.println("After rotating array by once=");
        replaceArray(arr,arr.length);
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");

	}

}
