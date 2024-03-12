import java.util.*;
public class Solution {
	public static String removeConsecutiveDuplicates(String s) {

		// Write your code here
		 StringBuilder sb=new StringBuilder();
		int i=0;
		int j=1;
		while(i<s.length()&&j<s.length()){
			if(s.charAt(i)!=s.charAt(j)){
				sb.append(s.charAt(i));
				i=j;
				j++;
			}
			else{
				j++;
			}
		}
		if(i<s.length()){
				sb.append(s.charAt(i));
			}
		
		return sb.toString();
	}

}
