class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder(s);
        int n=sb.length();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=sb.charAt(i);
            if(c=='('){
                st.push(i);
            }
            else if(c==')'){
            if(!st.isEmpty()&&sb.charAt(st.peek())=='('){
                st.pop();
            }
            else{
                sb.deleteCharAt(i);
                i--;
                n--;
            }
            } 
        }
        while(!st.isEmpty()){
            sb.deleteCharAt(st.pop());
        }
        return sb.toString();
    }
}