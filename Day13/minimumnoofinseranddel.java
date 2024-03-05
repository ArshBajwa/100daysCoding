class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    int m=str1.length();
	    int n=str2.length();
	    int  del=m-lcs(str1,str2,m,n);
	    int ins=n-lcs(str1,str2,m,n);
	    return del+ins;
	} 
	public static int lcs(String str1,String str2,int m,int n){
	      int [][]dp=new int[m+1][n+1];
	      for(int i=0;i<=m;i++){
	          for(int j=0;j<=n;j++){
	             if(i==0||j==0)
	             {
	                 dp[i][j]=0;
	             }
	          }
	      }
	      
	      for(int i=1;i<=m;i++){
	          for(int j=1;j<=n;j++){
	              if(str1.charAt(i-1)==str2.charAt(j-1)){
	                  dp[i][j]=1+dp[i-1][j-1];
	              }
	              else{
	                  dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
	              }
	          }
	      }
	      return dp[m][n];
	      
	    
	    
	}
}