package learn_the_Basic;

public class OneToNWithoutLoop {
	 public static int[] printNos(int x) {
	        // Write Your Code Here
	        int[] arr=new int[x];
	        output(arr,x,0);
	        return arr;
	    }
	    static void output(int arr[],int x,int i)
	    {
	        if(i==x)
	        return;
	        arr[i]=i+1;
	        output(arr,x,i+1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[]=printNos(6);
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]+" ");
		

	}

}
