package sortingAlgos;
import java.util.*;
import java.util.Scanner;

public class SelectionSort {
     static void selection(int[] arr,int n)
     {
    	 for (int i = 0; i < n-1; i++)
         {
             // Find the minimum element in unsorted array
             int min_idx = i;
             for (int j = i+1; j < n; j++) {
                 if (arr[j] < arr[min_idx])
                     min_idx = j;
         }
             int temp = arr[min_idx];
             arr[min_idx] = arr[i];
             arr[i] = temp;
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
        selection(arr,n);
        System.out.println("After sorting array Elements is=");
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");

	}

}
