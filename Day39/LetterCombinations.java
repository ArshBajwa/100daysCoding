class Solution {
   private  List<String>l=new ArrayList<>();
    private HashMap<Character,String>mp=new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.length()==0)return l;
        mp.put('2',"abc");
         mp.put('3',"def"); 
         mp.put('4',"ghi");
          mp.put('5',"jkl");
           mp.put('6',"mno");
           mp.put('7',"pqrs");
            mp.put('8',"tuv");
            mp.put('9',"wxyz");
          
              solve(digits,0,new StringBuilder());
              return l;

}

public void solve(String digits,int i,StringBuilder sb){
  
      if(i==digits.length())
{
    l.add(sb.toString());
    return;
}
char ch=digits.charAt(i);
String s=mp.get(ch);
if(s!=null){
     for(int j=0;j<s.length();j++){
        char c=s.charAt(j);
        sb.append(c);
        solve(digits,i+1,sb);
        sb.deleteCharAt(sb.length()-1);

     }
}


}
}