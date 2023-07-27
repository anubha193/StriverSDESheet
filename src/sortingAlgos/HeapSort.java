package sortingAlgos;

import java.util.Scanner;

public class HeapSort {
	//heapify method.
	static void sort(int n,int arr[])
	{
	for (int i = n/ 2 - 1; i >= 0; i--)
		heapify(arr, n, i);
	//check only non-leaf nodes only.
	for (int i = n- 1; i > 0; i--) {
        // Move current root to end
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        // call max heapify on the reduced heap
        heapify(arr, i, 0);
    }
	}
    static void heapify(int[] arr,int n,int i)
    {
    	int largest=i;
    	int left=2*i+1;
    	int right=2*i+2;
    	if(left<n && arr[largest]<arr[left])
    		largest=left;
    	if(right<n && arr[largest]<arr[right])
    		largest=right;
    	if(largest!=i)
    	{
    		int temp=arr[largest];
    		arr[largest]=arr[i];
    		arr[i]=temp;
    	   heapify(arr,n,largest);
    	}
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
        sort(n,arr);
        System.out.println("After sorting array Elements is=");
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");

	}

}
