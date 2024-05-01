class Solution {
    public int[] replaceElements(int[] arr) {
         int []a=new int[arr.length];
         a[a.length-1]=-1;
         for(int i=arr.length-1;i>0;i--){
               if(arr[i]>a[i]){
                   a[i-1]=arr[i];
               }
             else{
                a[i-1]=a[i];
             }
         }
         return a;
        
    }
}