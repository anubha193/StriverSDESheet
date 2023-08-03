package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class LeftRotateArrayByKPlace {
     static void replaceArray(int arr[],int n,int k)
     {
    	  
    	 k=k%n;
    	 if(k>n)return;
    	 int r=n-k;
    	 int[] res=Arrays.copyOf(arr, n);
    	 int count=0;
    	 for(int i=r;i<n;i++) {
    		 arr[count]=arr[i];
    		 count++;
    	 }
    	 for(int i=0;i<r;i++) {
    		 arr[count]=res[i];
    		 count++;
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
        System.out.println("Enter the value of k=");
        int k=sc.nextInt();
        System.out.println("After rotating array by once=");
        replaceArray(arr,arr.length,k);
        for(int i=0;i<n;i++)
        	System.out.print(arr[i]+" ");

	}

}
