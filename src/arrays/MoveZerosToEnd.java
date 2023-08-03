package arrays;

import java.util.Scanner;

public class MoveZerosToEnd {
    static void MoveZeros(int[] arr,int n)
    {
    	int count=-1;
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]!=0)
    		{
    			count++;
    			arr[count]=arr[i];
    		}
    	}
//    	System.out.println(count);
    	for(int i=count+1;i<n;i++)
    		arr[i]=0;
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
        System.out.println("After moving all the zeros at end=");
        MoveZeros(arr,arr.length);
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");


	}

}
