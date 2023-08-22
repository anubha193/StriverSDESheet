package arrays;

public class LongestSubarrayWithGivenSum {
    static int longestSubarray(int arr[],int k)
    {
    	int i=0;
    	int j=0;
    	int count=0;
    	int sum=0;
    	while(j<arr.length && i<=j)
    	{
    		sum+=arr[j];
    		while(sum>k)
    		{
    			sum-=arr[i];
    			i++;
    		}
    		if(sum==k) {
    			count=Math.max(count, j-i+1);
    			j++;
    		}
    			else if(sum<k)
    				j++;
    		
    	}	
    	return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,1,3};
	    System.out.println("Longest Subarray with given sum="+longestSubarray(arr,4));

	}

}

