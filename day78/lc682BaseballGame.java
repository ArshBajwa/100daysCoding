class Solution {
    public int calPoints(String[] operations) {
           Stack<Integer>st=new Stack<>();
           int sum=0;
           int tsum=0;
           for(String e:operations){
              if(!e.equals("C")&&!e.equals("D")&&!e.equals("+")){
                   st.push(Integer.parseInt(e));
              }
              else if(e.equals("C")){
                  st.pop();
              }
              else if(e.equals("D")){
                  st.push(2*st.peek());
              }
              else{
                 sum=st.get(st.size()-1)+st.get(st.size()-2);
                 st.push(sum);
              }
           }
           while(!st.isEmpty()){
               tsum+=st.pop();
           }
           return tsum;
    }
}