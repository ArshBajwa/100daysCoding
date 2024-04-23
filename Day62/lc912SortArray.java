class Solution {
    public int[] sortArray(int[] nums) {
       mergeSort(nums,0,nums.length-1);
       return nums;  
    }
    public static void mergeSort(int []nums,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,r);
            merge(nums,l,mid,r);
        }
        
        
    }
    public static void merge(int[]nums,int l,int mid,int r){
         int []b=new int[nums.length];
         int i=l;
         int j=mid+1;
         int k=l;
         while(i<=mid&&j<=r){
            if(nums[i]<nums[j]){
                b[k++]=nums[i++];
            }
            else{
                b[k++]=nums[j++];
            }
         }
         
            while(j<=r){
                b[k++]=nums[j++];
            }
         
        
            while(i<=mid){
                b[k++]=nums[i++];
            }
         
         for(int m=l;m<=r;m++){
             nums[m]=b[m];
         }
     
    }
    


}