import java.util.* ;
import java.io.*; 
public class Solution {
	public static void swap(int []arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;

	}
	public static int firstMissing(int[] arr, int n) {
		// Write your code here.	
		int i=0;
		while(i<n){
			int sahi=arr[i]-1;
			if(arr[i]>0&&arr[i]<n&&arr[i]!=arr[sahi]){
				swap(arr,i,sahi);
			} 
			else{
				i++;
			}
		}
			for(int j=0;j<n;j++){
				if(arr[j]!=j+1){
					return j+1;
				}
			}
		
		return n+1;	
	}
}
