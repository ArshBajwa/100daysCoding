class Solution {
    public int compress(char[] chars) {
        int index=0;
       int cnt=1;
        int n=chars.length;
        for(int i=0;i<n;i++){
            cnt=1;
            while(i<n-1 && chars[i]==chars[i+1]){
                i++;
                cnt++;
            }
            chars[index]=chars[i];
            index++;
            if(cnt>1){
                for(char c:Integer.toString(cnt).toCharArray()){
                    chars[index]=c;
                    index++;
                }
            }
            

        }
        return index;
       
}
}