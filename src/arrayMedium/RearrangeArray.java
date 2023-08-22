package arrayMedium;

public class RearrangeArray {
	public static int[] alternateNumbers(int []arr) {
        // Write your code here.
        int pos=0;
	     int neg=1;
	     int res[]=new int[arr.length];
        int n=arr.length;
	     for(int i=0;i<n;i++)
	     {
	    	 if(arr[i]>0) {
	    		 res[pos]=arr[i];
	    	 pos+=2;
	    	 }
	    	 else {
	    		 res[neg]=arr[i];
	    	 neg+=2;
	    	 }
	    	
	     }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,-4,-5};
		int temp[]=alternateNumbers(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(temp[i]+" ");

	}

}
