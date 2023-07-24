package learn_the_Basic;
import java.util.*;
public class FrequencyArray {
    static int[] frequency(int arr[],int n)
    {
    	HashMap<Integer,Integer> hm=new HashMap<>();
    	for(int i=0;i<n;i++)
    	{
    		if(hm.containsKey(arr[i]))
    			hm.put(arr[i], hm.get(arr[i])+1);
    		else
    			hm.put(arr[i], 1);
    	}
    	int res[]=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		if(hm.containsKey(i+1))
            res[i]=hm.get(i+1);
            else
            	res[i]=0;
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,1,9,2,7};
		int temp[]=frequency(arr,arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.print(temp[i]+" ");

	}

}
