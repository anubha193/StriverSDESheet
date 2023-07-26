package sortingAlgos;

import java.util.Scanner;

public class RecursiveInsertionSort {
    static void insertion(int[] arr,int n,int i)
    {
    	if(i==n)return;
    	int j=i-1;
    	while(j>=0 && arr[j]>arr[j+1])
    	{
    		int temp=arr[j+1];
    		arr[j+1]=arr[j];
    		arr[j]=temp;
    		j--;
    	}
    	insertion(arr,n,i+1);
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
        insertion(arr,n,1);
        System.out.println("After sorting array Elements is=");
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" "); 
	}

}
