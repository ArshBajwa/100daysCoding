package st;
import java.util.*;
public class LongestSubstring{
    public static int solve(String s,int n){
        int i=0;
        int j=0;
        int max=0;
        HashMap<Character,Integer>mp=new HashMap<>();
        while(j<n){
            char ch=s.charAt(j);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(mp.size()==j-i+1){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(mp.size()<j-i+1){
                char e=s.charAt(i);
                while(mp.size()<j-i+1){
                    mp.put(e,mp.getOrDefault(e,0)-1);
                    if(mp.get(e)==0){
                        mp.remove(e);
                    }
                    i++;
                }
                j++;
            }
            

        }
        return max;
    }
    public static void main(String[] args) {
        String s="ABCDEFABCIHJKLABCD";
        System.out.println(solve(s, s.length()));

           
    }
}