package arrayMedium;
import java.util.*;
public class SaveLife {
	static String maxSum(String w,char x[],int b[], int n){
        //code here
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(x[i],b[i]);
        }
        int arr[]=new int[w.length()];
        for(int i=0;i<w.length();i++)
        {
            char ch=w.charAt(i);
            if(hm.containsKey(ch))
            {
             arr[i]=hm.get(ch);
            }
            else
            {
              arr[i]=(int)ch; 
            }
        }
        HashMap<Integer,Character> hm2=new HashMap<>();
        for(int i=0;i<w.length();i++)
        {
            hm2.put(arr[i],w.charAt(i));
        }
        int temp[]=maximumSumSubarray(arr);
        
        String str=w.substring(temp[0],temp[1]+1);
        return str;
    }
	 static int[] maximumSumSubarray(int arr[])
	    {
	     
	    	int []al=new int[2];
	    	int curr=0;
	    	int start=0;
	    	int end=0;
	    	int s=0;
	    	int max=Integer.MIN_VALUE;
	    	for(int i=0;i<arr.length;i++) {
	    		curr+=arr[i];
	    	if(curr>max) {
	    		max=curr;
	    		end=i;
	    		start=s;
	    	}
	    	if(curr<0) {
	    		curr=0;
	    		s=i+1;
	    		
	    	}
	    	}
	    	al[0]=start;
	    	al[1]=end;
	    	return al;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w="ok";
		char x[]= {'k','o'};
		int[] b= {-880,53};
		int n=2;
		System.out.println(maxSum(w,x,b,n));
		

	}

}
