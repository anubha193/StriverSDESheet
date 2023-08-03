package arrays;

public class MaximumConsectiveOnces {
     static int once(int arr[],int n)
     {
    	 int max=0;
         int count=0;
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]==0)
             {
                 max=Math.max(max,count);
                 count=0;
             }
             else
             count++;
         }
         return Math.max(count,max); 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,0,1,1,1};
		System.out.println("the maximum consective once is="+once(arr,arr.length));

	}

}
