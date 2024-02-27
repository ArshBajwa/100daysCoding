public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int a[]=new int[2];
        int n=A.length;
        int Hash[]=new int[n+1];
        for(int i=0;i<A.length;i++){
            Hash[A[i]]++;
        }
        int miss=-1;
        int repeat=-1;
        for(int i=1;i<=A.length;i++){
            if(Hash[i]==2){repeat=i;}
            else if(Hash[i]==0){miss=i;}
            if(miss!=-1&&repeat!=-1){
                break;
            }
        }
        a[0]=repeat;
        a[1]=miss;
    return a;
}
}