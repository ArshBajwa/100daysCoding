class Solution {
    public static int merge(int []nums,int s,int mid,int e){
        int right=mid+1;
        int cnt=0;
        for(int i=s;i<=mid;i++){
            while(right<=e&&nums[i]>(2*(long)nums[right])){
                right++;  
            }
            cnt+=(right-(mid+1));
        }
        ArrayList<Integer>temp=new ArrayList<>();
        int left=s;
        right=mid+1;
        while(left<=mid&&right<=e){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }
           else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while(right<=e){
            temp.add(nums[right]);
            right++;
        }
         //temp to arr
         for(int i=s;i<=e;i++){
            nums[i]=temp.get(i-s);
         }
         return cnt;
    }
     public static int mergeSort(int []nums,int s,int e){
         if(s>=e)return 0;
         int mid=(s+e)/2;
          int cnt=mergeSort(nums,s,mid);
          cnt+=mergeSort(nums,mid+1,e);
          cnt+=merge(nums,s,mid,e);
          return cnt;
     }
 
 
     public int reversePairs(int[] nums) {
         return mergeSort(nums,0,nums.length-1);
     
     }
 }