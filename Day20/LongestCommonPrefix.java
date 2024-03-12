import java.util.*;
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) 
{
	Arrays.sort(arr);
	StringBuilder s=new StringBuilder();
	char f[]=arr[0].toCharArray();
	char l[]=arr[arr.length-1].toCharArray();
	for(int i=0;i<f.length;i++){
		if(f[i]==l[i]){
			s.append(f[i]);
		}
		else{
			break;
		}
	}
	return s.toString();
	      
		  

}
}
