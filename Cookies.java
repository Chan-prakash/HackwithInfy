package HackwithInfygreedy;
import java.util.*;
public class Cookies {
	static int counterCookies(int s[],int g[]) {
		// sort the array
		Arrays.sort(s);
		Arrays.sort(g);
		// the lenght of the array..
		int m=g.length;
		int n=s.length;
	    // the pointer 
		int l=0; // for the g
		int r=0; // for the s
		while(l<m && r<n) {
			if(g[l]<=s[r]) {
				l++;
				r++;
			}
			else {
				r++;
			}
			
		}
		
		return l;
		
	}
   public static void main(String[] args) {
	int s[]= {1,1,2,2,3,4};
	int g[]= {1,3,3,4,5};
	int result=counterCookies(s,g); // passing the parameter is cruical//
	System.out.println(result);
	 
}

}
