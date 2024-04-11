class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>s=new Stack<>();
        if(num.length()==k){
            return "0";
        }
        s.push(num.charAt(0));
        for(int i=1;i<num.length();i++){
            while(!s.isEmpty()&&k>0&&s.peek()>num.charAt(i)){
                s.pop();
                k--;
            }
            s.push(num.charAt(i)); 
        } 

            while(k>0){
                s.pop();
                k--;
            }    
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.insert(0,s.pop());
        }
        System.out.print(sb);
        while(sb.length()>1&&sb.charAt(0)=='0'){
             sb.deleteCharAt(0);
        }
        return sb.toString();
        
        
    }
}