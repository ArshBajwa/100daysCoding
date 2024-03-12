import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static boolean isAnagram(String str1, String str2) {
        //Your code goes here
        Map<Character,Integer>mp1=freq(str1);
        Map<Character,Integer>mp2=freq(str2);
        return mp1.equals(mp2);
        


    }
    public static Map<Character,Integer> freq(String str1){
        Map<Character,Integer>mp=new HashMap<>();
        for(char e:str1.toCharArray()){
            if(!mp.containsKey(e)){
                mp.put(e,1);
            }
            else{
                mp.put(e,mp.get(e)+1);
            }
        }
        return mp;

    }

}