package HackwithInfygreedy;
public class containerwithmostwater {
	public static void main(String[] args) {
		int arr[]= {1,5,6,2,5,4,8,3,7};
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		int max=0;
		int index=0;
		int ans=0;
		int greater=0;
		for(int i=0;i<mid;i++) {
			if(arr[i]>max) {
				max=arr[i];
				index=i;
			}
		}
		
	
	for(int i=index+1;i<arr.length;i++) {
		if(arr[i]<=max) {
			ans=arr[i]*Math.abs(index-i);
			if(ans>greater) {
				greater=ans;
			}
		}
		else {
			ans=max*Math.abs(index-i);
			if(ans>greater) {
				greater=ans;
			}
		}
	}
	System.out.println(ans);

 }
}
