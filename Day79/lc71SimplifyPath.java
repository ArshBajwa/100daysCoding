class Solution {
    public String simplifyPath(String path) {
          Stack<String>s=new Stack<>();
          String []str=path.split("/");
          for(String dir:str){
              if(dir.isEmpty()||dir.equals(".")){
                  continue;
              }
              else if(dir.equals("..")){
                  if(!s.isEmpty()){
                       s.pop();
                  }
              }
              else{
                s.push(dir);
              }
          }
         StringBuilder sb=new StringBuilder();
         while(!s.isEmpty()){
         sb.insert(0,"/"+s.pop());
         }
         if(!sb.toString().equals("")){
            return sb.toString();
         }
          return "/";
    }
}