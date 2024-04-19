import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] lps(String a){
          int n=a.length();
          int []lps=new int[n];
          int len=0;
          int j=1;
          lps[0]=0;
          while(j<n){
                if(a.charAt(len)==a.charAt(j)){
                    len++;
                      lps[j]=len;
                      j++;
                }
                else{
                     if(len!=0){
                          len=lps[len-1];
                     }
                     else{
                          lps[j]=len;
                          j++;
                     }
                       
                }
          }
          return lps;

    }
    public static int findIndexOf(String a, String b) {
    int i = 0;
    int j = 0;
    int n = b.length();
    int m = a.length();
    int[] l = lps(a);
    while (i < n) {
           if(a.charAt(j)==b.charAt(i)){
                 i++;
                 j++;
           }
           if(j==m){
               return i-j;
           }
           else if(i<n&&a.charAt(j)!=b.charAt(i)){
                if(j!=0){
                    j=l[j-1];
                }
                else{
                    i++;
                }
                
                
           }
    }
    return -1;
}

}