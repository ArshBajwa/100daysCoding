package Dp;
public class PalindromePartioning {
    public static int palin(String s,int i,int j){
        if(i>=j)return 0;
        if(isPalin(s)){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int temp=1+palin(s, i, k)+palin(s, k+1, j);
            min=Math.min(min, temp);
        }
        return min;

    }
    public static boolean isPalin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                return true;
            }
            i++;
            j--;
        }
        return false;
        
    }
    public static void main(String[] args) {
          String s="ababbbabbababa";
          System.out.println(palin(s, 0, s.length()-1));
    }
}
