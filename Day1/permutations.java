package backtracking;

public class permutations {
    public static void per(String st,String t){
            if(st.isEmpty()){
                System.out.println(t);
                return;
            }
            for(int i=0;i<st.length();i++){
                char ch=st.charAt(i);
                String left=st.substring(0,i);
                String right=st.substring(i+1);
                String rem=left+right;
                per(rem, t+ch);
            }
    }
    public static void main(String[] args) {
        per("abc"," ");   
    }
}
