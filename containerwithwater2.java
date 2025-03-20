package HackwithInfygreedy;
public class containerwithwater2 {
	 static int container(int[]arr,int low,int high) {
		int ans=0;
		int result=0;
		while(low<high) {
			if(arr[low]<=arr[high]) {
				ans=arr[low]*Math.abs(high-low);
				low++;
				
			}
			if(arr[low]>arr[high]) {
				ans=arr[high]*Math.abs(high-low);	
				high--;
			   }
			result=Math.max(ans, result);
			}
			return result;
		}
		
	 
	
	public static void main(String[] args) {
		int arr[]= {1,1};
		int low=0;
		int high=arr.length-1;
		int result=container(arr,low,high);
		System.out.println(result);	
	}
}
