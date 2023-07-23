package learn_the_Basic;

public class NtoOneWithoutLoop {

    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[]=new int[x];
        print(x,arr,0);
        return arr;
       
    }
    static void print(int x,int[] arr,int i)
    {
     if(x==0)return;
     arr[i]=x;
     System.out.println(x+" "+i);
     print(x-1,arr,i+1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[]=printNos(5);
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]+" ");

	}

}
