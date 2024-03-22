class Solution {
    public String[] findWords(String[] words) {
           ArrayList<String>a=new ArrayList<>();
           String s1="qwertyuiopQWERTYUIOP";
           String s2="asdfghjklASDFGHJKL";
           String s3="zxcvbnmZXCVBNM";
           for(int i=0;i<words.length;i++){
                boolean r1=true,r2=true,r3=true;
                for(int j=0;j<words[i].length();j++){
                      char c=words[i].charAt(j);
                    if(!s1.contains(String.valueOf(c))){
                        r1=false;
                    } 
                    if(!s2.contains(String.valueOf(c))){
                        r2=false;
                    } 
                    if(!s3.contains(String.valueOf(c))){
                        r3=false;
                    } 
                    
                }
                if(r1||r2||r3){
                    a.add(words[i]);
                }

           }
           return a.toArray(new String[0]);
          
    }
}