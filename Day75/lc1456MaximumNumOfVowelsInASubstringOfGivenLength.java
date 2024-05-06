class Solution {
    public int maxVowels(String s, int k) {
        int cnt=0;
        int i=0;
        int j=0;
        int n=s.length();
        int maxi=Integer.MIN_VALUE;
        while(j<n){
            char c=s.charAt(j);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                 cnt++;
            }
            if(j-i+1<k){
                 j++;
            }
            else if(j-i+1==k){
                 if(cnt>maxi){
                    maxi=cnt;
                 }
                 char ch=s.charAt(i);
                 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                 cnt--;
            }
            i++;
            j++;
            }
        }
        return maxi;
    }
}