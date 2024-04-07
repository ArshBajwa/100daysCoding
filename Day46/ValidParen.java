class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>left=new Stack<>();
        Stack<Integer>ast=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                left.push(i);
            }
            else if(s.charAt(i)=='*'){
                ast.push(i);
            }
            else{
                if(!left.isEmpty()){
                    left.pop();
                }
                else if(!ast.isEmpty()){
                    ast.pop();
                }
                else{
                    return false;
                }
            }
        }
        while(!left.isEmpty()&&!ast.isEmpty()){
             if(left.pop()>ast.pop()){
                return false;
             }
        }
return left.isEmpty();

        }
}