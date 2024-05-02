class Solution {
    public int minSwaps(String s) {
        int cnt=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)==']'){
                 cnt++;
             }
             else{
                cnt--;
             }
             max=Math.max(max,cnt);
        }
        return (max+1)/2;
}
}

