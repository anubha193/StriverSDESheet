package arrayMedium;
import java.util.*;
public class NextParmutation {
    static void parmute(int arr[])
    {
    	ArrayList<Integer> al=new ArrayList<>();
    	int n=arr.length;
    	int value=-1;
    	for(int i=n-2;i>=0;i--)
    	{
    		if(arr[i]<arr[i+1])
    		{
    			value=i;
    			break;
    		}
    	}
    	if(value==-1) {
    		Arrays.sort(arr);
    		return;
    	}
    	int value2=0;
    	for(int i=n-1;i>=value;i--)
    	{
    		if(arr[i]>arr[value])
    		{
    			value2=i;
    			break;
    		}
    	}
    	System.out.println((value+1)+" "+(n-1));
    	swap(value,value2,arr);
    	Arrays.sort(arr, value+1, n);
    }
    static void swap(int i,int j,int[]arr)
    {
    	int temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2};
		parmute(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
