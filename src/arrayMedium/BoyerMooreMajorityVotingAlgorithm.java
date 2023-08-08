package arrayMedium;

public class BoyerMooreMajorityVotingAlgorithm {
   static int majority(int[] arr)
   { 
	   int candidate=-1;
	   int count=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   if(count==0)
		   {
			   candidate=arr[i];
			   count=1;
		   }
		   else if(arr[i]==candidate)
			   count++;
		   else count--;
	   }
	   return candidate;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,2,1,1,6,1};
		System.out.println("the majority element in the array is="+majority(arr));

	}

}
