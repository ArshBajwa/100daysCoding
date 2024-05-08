class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>al=new ArrayList<>();
         int i=0;
         int j=arr.length-1;
         while(j-i>=k){
             if(Math.abs(arr[i]-x)>Math.abs(arr[j]-x)){
                  i++;
             }
             else{
                j--;
             }
         }
         for(int m=i;m<=j;m++){
             al.add(arr[m]);
         }
return al;
       }
   }