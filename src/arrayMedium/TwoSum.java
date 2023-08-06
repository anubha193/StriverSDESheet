package arrayMedium;
import java.util.*;
public class TwoSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int arr[]= {2,7,11,15};
		int temp[]=sum(arr,9);
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]+" ");
		

	}

	 static int[] sum(int[] arr, int k) {
		int n=arr.length;
		HashMap<Integer,Integer> hm=new HashMap<>();
		int nums[]= {0,0};
		for(int i=0;i<n;i++)
		{
		if(hm.containsKey(k-arr[i]))
		{
			nums[0]=hm.get(k-arr[i]);
		    nums[1]=i;
		    return nums;
		}
		hm.put(arr[i], i);
		}
		return nums;
	}

}
