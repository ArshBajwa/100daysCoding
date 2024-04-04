class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int res[]=new int[n];
        Stack<Integer>s=new Stack<>();
        res[n-1]=0;
        s.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!s.isEmpty()&&temperatures[i]>=temperatures[s.peek()]){
                s.pop();
            }
            if(s.size()==0){
                res[i]=0;
            }
            else{
                res[i]=s.peek()-i;
            }
            s.push(i);
        }
        return res;
        
    }
}