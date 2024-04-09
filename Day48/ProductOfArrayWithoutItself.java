class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []prefix=new int[n];
        int []suffix=new int[n];
        for(int i=1;i<n;i++){
            prefix[0]=1;  
            prefix[i]=prefix[i-1]*nums[i-1];
            
        }
        for(int i=n-2;i>=0;i--){
             suffix[n-1]=1;
             suffix[i]=suffix[i+1]*nums[i+1];
              
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=prefix[i]*suffix[i];
        }
        return a;       
}
}