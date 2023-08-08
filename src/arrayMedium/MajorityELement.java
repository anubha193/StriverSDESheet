package arrayMedium;
import java.util.*;
public class MajorityELement {
	public static int majorityElement(int []arr) {
        // Write your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            hm.put(arr[i],hm.get(arr[i])+1);
            else
            hm.put(arr[i],1);
        }
        int size=arr.length/2;
        for(Map.Entry<Integer,Integer> i : hm.entrySet())
        {
            if(i.getValue()>size)
            return i.getKey();
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,1,3,1,1,3,1,1};
		System.out.println("The majority Element is "+majorityElement(arr));

	}

}
