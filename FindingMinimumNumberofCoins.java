package HackwithInfygreedy;
import java.util.*;
public class FindingMinimumNumberofCoins {
	public static void main(String[] args) {
		int target=0;
		int count=0;
		Integer arr[]= {1,2,5,10,20,50,100,200,500,1000,2000};
		List<Integer> coins=Arrays.asList(arr);
		int n=coins.size();
    	int i=n-1;
    	while(i>=0) {
			if(target>=coins.get(i)) {
				int res=target;
				target %=coins.get(i);
				res /=coins.get(i);
				count +=res;
			}
			else {
				i--;
		    }
    	}
		System.out.println("The minimun number of coins that required for the target is "+ count);	
	}

}
