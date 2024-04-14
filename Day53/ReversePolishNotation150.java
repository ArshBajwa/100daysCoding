class Solution {
    public int evalRPN(String[] tokens) {
        int res=0;
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch=tokens[i];
            if(ch.equals("+")){
                int a=s.pop();
                int b=s.pop();
                 res=a+b;
                s.push(res);
            }
            else if(ch.equals("-")){
               int a=s.pop();
                int b=s.pop();
            res=b-a;
                s.push(res);
            }
            else if(ch.equals("*")){
                int a=s.pop();
                int b=s.pop();
                 res=a*b;
                s.push(res);
            }
            else if(ch.equals("/")){
               int a = s.pop();
                int b = s.pop();
                if (a == 0) {
                    return 0;
                }
                res = b / a; 
                s.push(res);
            }
            
                else{
            int c=Integer.parseInt(ch);
                s.push(c);
                }
            
        }
        return s.peek();
        
    }
}