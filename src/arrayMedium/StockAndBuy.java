package arrayMedium;

public class StockAndBuy {
	static int maximum2(int arr[],int n)
	{
		int num[]=new int[n];
		num[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			num[i]=Math.max(arr[i],num[i+1]);
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			max=Math.max(max, num[i]-arr[i]);
		}
		return max;
	}
    static int maximum1(int[] arr,int n)
    {
    	int min=arr[0];
    	int max=Integer.MIN_VALUE;
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]>min)
    			max=Math.max(max, arr[i]-min);
    		else
    			min=arr[i];
    	}
    	return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,1,5,3,6,4};
		System.out.println("The maximum profit is="+maximum1(arr,arr.length));
		System.out.println("The maximum profit is="+maximum2(arr,arr.length));

	}

}
