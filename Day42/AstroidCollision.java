class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int a:asteroids){
             if(a>0){
                st.push(a);
             }
             else{
             while(!st.isEmpty()&&st.peek()>0&&Math.abs(a)>st.peek()){
                st.pop();
             }
             if(!st.isEmpty()&&st.peek()==Math.abs(a)){
                st.pop();
             }
             else if(st.isEmpty()||st.peek()<0){
                st.push(a);
             }
             }

        }
        int a[]=new int[st.size()];
        for(int i=a.length-1;i>=0;i--){
            a[i]=st.pop();
        }
           return a;        
    }
}