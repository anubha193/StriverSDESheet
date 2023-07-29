package sortingAlgos;

import java.util.Scanner;

public class MergeSort {
	//merge two array
	static void sort(int arr[], int l, int r)
	    {
	        if (l < r) {
	            int m = l + (r - l) / 2;
	 
	            sort(arr, l, m);
	            sort(arr, m + 1, r);
	            merge(arr, l, m, r);
	        }
	    }
    static void merge(int[] arr,int l,int m,int r)
    {
    	int n1 = m - l + 1;
        int n2 = r - m;
        int Left[] = new int[n1];
        int Right[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            Left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            Right[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            }
            else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    	
    }
	public static void main(String[] args) {
		 
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
		System.out.println(n/2);
       sort(arr,0,n-1);
        System.out.println("the sorted array is=");
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");

	}

}
