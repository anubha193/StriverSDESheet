package arrays;
import java.util.*;
public class FindMissingNumber {
	 public static int missingNumber3(int []arr, int n) {

	        int xor1 = 0, xor2 = 0;

	        for (int i = 0; i < n - 1; i++) {
	            xor2 = xor2 ^ arr[i]; // XOR of array elements
	            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
	        }
	        xor1 = xor1 ^ n; //XOR up to [1...N]

	        return (xor1 ^ xor2); // the missing number
	    }
	static int missingNumber2(int[] nums,int n)
	{
		int sum=(n*(n+1))/2;
		int s2=0;
		for(int i=0;i<n-1;i++)
			s2+=nums[i];
		return sum-s2;
	}
    static int missingNumber(int[] nums,int n)
    {
    	Arrays.sort(nums);
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]!=i )
           return i;
    }
   
       return nums.length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stubint ans
		int arr[]= {1,2,4,0};
		int ans=missingNumber(arr,arr.length);
		int ans2=missingNumber2(arr,arr.length+1);
		int ans3=missingNumber3(arr,arr.length+1);
	   System.out.println("the missing number in array is="+ans);
	   System.out.println("the missing number in array is="+ans2);
	   System.out.println("the missing number in array is="+ans2);
		

	}

}
