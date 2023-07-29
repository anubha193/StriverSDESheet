package arrays;

import java.util.*;

public class SecondLargestElement {
      static int largest(int arr[],int n)
      {
    	  PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    	  for(int i=0;i<n;i++) 
    	  pq.add(arr[i]);
    	  int ans=0;
    	 for(int i=0;i<n;i++)
    	 {
    		 if(i==1)
    		 {
    			 ans= pq.poll();
    			 break;
    		 }
    		 System.out.println( pq.poll());
    	 }
    	 return ans;
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
       System.out.println("the second largest element is="+largest(arr,n));

	}

}
