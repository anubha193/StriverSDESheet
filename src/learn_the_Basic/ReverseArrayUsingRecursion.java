package learn_the_Basic;
import java.util.*;
public class ReverseArrayUsingRecursion {
	public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int[] rev=new int[n];
        reverse(nums, rev, n-1,0);
       return rev;

    } 
    static void reverse(int[] nums,int[] rev,int n,int i)
    {
    if(n<0)return;
    rev[i]=nums[n];
    reverse(nums, rev, n-1, i+1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4,5,6};
		int temp[]=reverseArray(nums.length,nums);
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]+" ");

	}

}
