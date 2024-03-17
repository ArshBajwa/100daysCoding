class Solution {
    public int maxArea(int[] height) {
         int i=0;
         int j=height.length-1;
         int area=Integer.MIN_VALUE;
         while(i<j){
             int l=Math.min(height[i],height[j]);
             int b=j-i;
             int ar=l*b;
              area=Math.max(area,ar);
             if(height[i]<height[j]){
                i++;
             }
             else{
                j--;
             }
            

         }
         return area;
    }
}