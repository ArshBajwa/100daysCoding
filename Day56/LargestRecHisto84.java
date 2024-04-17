class Solution {
    public int largestRectangleArea(int[] heights) {
        int p[]=prevsmall(heights);
        int n[]=nextsmall(heights);
        int max=0;
        for(int i=0;i<heights.length;i++){
            max=Math.max(max,heights[i]*(n[i]-p[i]-1));
        }
        return max;
        
    }
    public static int[] prevsmall(int []heights){
        int []prev=new int[heights.length];
        Stack<Integer>s=new Stack<>();
        s.push(0);
        prev[0]=-1;
        for(int i=1;i<heights.length;i++){
        while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
            s.pop();
        }
       
        if(s.isEmpty()){
            prev[i]=-1;
        }
        else{
            prev[i]=s.peek();
        }
        s.push(i);
        }
        return prev;
    }
    public static int[] nextsmall(int []heights){
        int []prev=new int[heights.length];
        Stack<Integer>s=new Stack<>();
        s.push(heights.length-1);
        int n=heights.length;
        prev[n-1]=n;
        for(int i=heights.length-2;i>=0;i--){
        while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
            s.pop();
        }
       
        if(s.isEmpty()){
            prev[i]=heights.length;
        }
        else{
            prev[i]=s.peek();
        }
        s.push(i);
        }
        return prev;
    }
}