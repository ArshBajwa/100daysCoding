class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0;i<matrix.length;i++){
            int a[]=matrix[i];
            if(target>=a[0]&&target<=a[a.length-1]){
                if(solve(a,target)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean solve(int []a,int target){
          int s=0;
          int e=a.length-1;
          while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==target){
                return true;
            }
            else if(a[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
             
          }
          return false;
    }

}