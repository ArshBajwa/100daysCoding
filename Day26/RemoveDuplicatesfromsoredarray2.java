class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer>l=new ArrayList<>();
        int n=nums.length;
        int i=0;
        int j=1;
        int cnt=1;
        while(i<n&&j<n){
            if(nums[i]==nums[j]){
                cnt++;
                if(cnt<=2){
                    l.add(nums[i]);  
                }   
            }
            else{
                l.add(nums[i]);
                cnt=1; 
            }
            i=j;
            j++;
            }
            if(i<n){
                l.add(nums[i]);
            }
            for(int k=0;k<l.size();k++){
                nums[k]=l.get(k);
            }
        
        return l.size(); 
    }
}