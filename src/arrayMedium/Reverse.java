package arrayMedium;
import java.util.*;
public class Reverse {
	static String reverse(String str,int i,int j)
    {
		String s1=str.substring(0,i);
		String s2=str.substring(i,j+1);
		String s3=str.substring(j+1,str.length() );
//		System.out.println(s1+" "+s2+" "+s3);
        StringBuilder input1 = new StringBuilder();
        input1.append(s2);
        input1.reverse();
        String s4= input1.toString();
        String ans=s1+s4+s3;
        return ans;
    }
	static void printSubArrays(String arr, int start, int end,HashSet<String> hs)
    {
        // Stop if we have reached the end of the array
        if (end == arr.length())
            return;
        // Increment the end point and start from 0
        else if (start > end)
            printSubArrays(arr, 0, end + 1,hs);
        
        else {
            for (int i = start; i <= end; i++)
                hs.add(reverse(arr,start,end));
            printSubArrays(arr, start + 1, end,hs);
        }
        return;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdefghi";
		 int count=0;
		 int n=str.length();
		 HashSet<String> hs=new HashSet<>();
		 printSubArrays(str, 0, 0,hs);
	       System.out.println(hs.size());
	}

}
