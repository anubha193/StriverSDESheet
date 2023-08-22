package arrayMedium;

public class MinimunSubArraySum {
    static int minimum(int[] arr)
    {
    	int curr=0;
    	int min=Integer.MAX_VALUE;
    	for(int i=0;i<arr.length;i++)
    	{
    		curr+=arr[i];
    		if(min>curr)
    			min=curr;
    		else if(curr>0)
    			curr=0;
    	}
    	return min;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3, -4, 2, -3, -1, 7, -5};
		System.out.println(minimum(arr));
		

	}

}
