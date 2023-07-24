package learn_the_Basic;

public class Mathpow {
	public static double myPow(double x, int n) {
	      double[] ans=  new double[1];
	      ans[0]=1.0;
	      calc(x,n,ans);
	      return ans[0];  
	    }
	    static void calc(double x,int n,double[] ans)
	    {
	        if(n==0)return;
	        ans[0]=ans[0]*x;
	        calc(x,n-1,ans);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stubmyPow
		System.out.println(myPow(3.0,10));

	}

}
