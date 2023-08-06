package arrays;

public class MaximumConsectiveOnesAfterFlipKZero {
	public static int longestOnes(int[] nums, int k) {
        int ans=Integer.MIN_VALUE;
        int zero=0;
        int i=0;
        int j=0;
        while(j<nums.length)
        {
            if(nums[j]==0)
            {
                zero++;
                while(zero>k)
                {
                   if(nums[i]==0)
                   zero--;
                   i++;
                }
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,0,0,0,1,1,1,1,0};
		System.out.println("maxium consective once after flip k zero into one is="+longestOnes(arr,2));

	}

}
