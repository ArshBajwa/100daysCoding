import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
           List<int[]>l=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 if(arr[i]+arr[j]==s){
                     if(arr[i]<arr[j]){
                          int a[]={arr[i],arr[j]};
                       l.add(a);
                     }
                     else{
                           int a[]={arr[j],arr[i]};
                       l.add(a);
                     }
                 }
            }
        }
        Collections.sort(l,new Comparator<int[]>(){;
            public int compare(int []a,int []b){
                if(a[0]!=b[0]){
                    return Integer.compare(a[0],b[0]);
                }
                else{
                    return Integer.compare(a[1], b[1]);
                }
            }
    });
 
        return l;
        
        
            }
}
