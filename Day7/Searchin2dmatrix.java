class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int s=0;
        int e=(r*c)-1;
        while(s<=e){
            int mid=s+(e-s)/2;
         int row=mid/c;
        int col=mid%c;
         if(matrix[row][col]==target){
             return true;
         }
         else if(target>matrix[row][col]){
            s=mid+1;
         }
         else{
           e=mid-1;
         }
        }
         return false;
    
    }
}