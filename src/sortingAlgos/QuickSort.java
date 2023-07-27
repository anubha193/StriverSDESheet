package sortingAlgos;

import java.util.Scanner;

public class QuickSort {
	static void swap(int i,int j,int[] arr)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void quickSort(int low,int high,int[] arr)
	{
		if(low<high)
		{
			int p=partition(low,high,arr);
			System.out.println(p);
			quickSort(low,p-1,arr);
			quickSort(p+1,high,arr);
		}
	}
    static int partition(int low,int high,int[] arr)
    {
    	int i=low;
    	int j=high;
    	int pivot=arr[low];
    	while(i<j) {
    	while(arr[i]<=pivot && i<=high)
    		i++;
    	while(arr[j] > pivot && j>=0)
    		j--;
    	if(i<j)
    		swap(i,j,arr);
    	}
    		swap(j,low,arr);
    	return j;
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
        int p=partition(0,n-1,arr);
        quickSort(0,n-1,arr);
        System.out.println("After sorting array Elements is=");
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");
}

}
