package Dp;
import java.util.*;
public class zerooneknapsack {
    public static int weight(int []wt,int[]val,int w,int n,int [][]dp){
        if(n==0||w==0){
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if(wt[n-1]<=w){
            return dp[n][w]=Math.max(val[n-1]+weight(wt, val, w-wt[n-1], n-1,dp),weight(wt, val, w, n-1,dp));
        }
        else if(wt[n-1]>=w){
              return dp[n][w]=weight(wt, val, w, n-1,dp);
        }

        return 0;

        
    }
    public static void main(String[] args) {
        int n=3;
        int wt[]={4,5,6};
        int val[]={1,2,3};
        int w=3;
        int [][]dp=new int[n+1][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(weight(wt, val, w, n,dp));

    }
}
