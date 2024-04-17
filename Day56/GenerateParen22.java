class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>a=new ArrayList<String>();
        if(n<=0){
           return a;
        }
        solve("(",1,0,a,n);
        return a;
    }
    public static void solve(String s,int o,int c,List<String>a,int n){

         if(s.length()==2*n){
             a.add(s);
             return;
         }
         if(o<n){
            solve(s+"(",o+1,c,a,n);
         }
         if(c<o){
            solve(s+")",o,c+1,a,n);
         }
    }
}