package arrayMedium;
import java.util.*;
public class SortAnArray01And2 {
	public static void sortArray(ArrayList<Integer> al, int n) {
        // Write your code here.
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<n;i++)
        {
          if(al.get(i)==0)zero++;
          else if(al.get(i)==1)one++;
          else two++;
        }
        al.clear();
        while(zero!=0)
        {
            al.add(0);
            zero--;
        }
        while(one!=0){
        al.add(1);
        one--;
        }
        while(two!=0){
        al.add(2);
        two--;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al =new ArrayList<>();
		al.add(0);
		al.add(2);
		al.add(1);
		al.add(1);
		sortArray(al,al.size());
		System.out.println(al);

	}

}
