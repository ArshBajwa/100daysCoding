class Solution {
    public String decodeString(String s) {
        Stack<Character>st=new Stack<>();
         for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
              if(c!=']'){
                  st.push(c);
              }
              else{
                 StringBuilder s1=new StringBuilder();
                 while(!st.isEmpty()&&st.peek()!='['){
                       s1.insert(0,st.pop());
                 }
                 st.pop();
                 StringBuilder cnt=new StringBuilder();
                 while(!st.isEmpty()&&Character.isDigit(st.peek())){
                        cnt.insert(0,st.pop());
              }
              int ch=Integer.parseInt(cnt.toString());
              String decode=s1.toString().repeat(ch);
              for(char e:decode.toCharArray()){
                   st.push(e);
              }
             
        }
        
    }
    StringBuilder a=new StringBuilder();
    while(!st.isEmpty()){
         a.insert(0,st.pop());
    }
    return a.toString();
  
}
}