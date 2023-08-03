package arrays;

import java.util.*;

public class Union {
	static ArrayList<Integer> union(int[] arr1,int n,int arr2[],int m)
	{
		int size=n+m;
		int ans[]=new int[size];
		int count=0;
		for(int i=0;i<n;i++) {
			ans[i]=arr1[i];
			count++;
		}
		int k=0;
		System.out.println(count);
		for(int i=count;i<size;i++)
		{
//			System.out.println(arr2[k]);
			ans[i]=arr2[k];
			k++;
		}
		Arrays.sort(ans);
		ArrayList<Integer> al=new ArrayList<>();
		count=0;
	    for(int j=1;j<ans.length;j++)
	            {
	                if(ans[count]!=ans[j])
	                {
	                    count++;
	                    ans[count]=ans[j];
	                }
	            }
        for(int i=0;i<count+1;i++)
        	al.add(ans[i]);
        return al;
	}
     public static void main(String[] args)
     {
    	 int arr1[]= {1,2,3,4,6};
    	 int arr2[]= {2,3,5};
    	 int n=arr1.length;
    	 int m=arr2.length;
    	 System.out.println(union(arr1,n,arr2,m));
     }
}
