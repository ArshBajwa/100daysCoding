//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int d=sc.nextInt();
            
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            Solution obj=new Solution();
            int res=obj.countPartitions(n, d, arr);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//Back-end complete function Template for Java

class Solution{
    
    public static int count(int []arr,int s){
        int mod=(int)1e9+7;
        int n=arr.length;
        int [][]dp=new int[n+1][s+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=s;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j]=1;
                }
            }
        }
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=s;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=(dp[i-1][j-arr[i-1]]+dp[i-1][j])%mod;
                }
                else{
                    dp[i][j]=(dp[i-1][j])%mod;
                }
            }
        }
        return dp[n][s];
        
    }

    public int countPartitions(int n, int d, int arr[]){
        
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        s+=d;
        if(s%2==1)return 0;
        s/=2;
        return count(arr,s);
        // Code here
    }
}