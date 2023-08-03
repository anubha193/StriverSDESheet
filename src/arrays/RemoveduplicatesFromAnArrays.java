package arrays;

public class RemoveduplicatesFromAnArrays {
    static int duplicate(int []arr,int n)
    {
    	  int count=0;
    	    for(int j=1;j<arr.length;j++)
    	            {
    	                if(arr[count]!=arr[j])
    	                {
    	                    count++;
    	                    arr[count]=arr[j];
    	                }
    	            }
    	        return count+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,3,3,4,4,4,5};
		int temp=duplicate(arr,arr.length);
		for(int i=0;i<temp;i++)
			System.out.print(arr[i]+" ");

	}

}
