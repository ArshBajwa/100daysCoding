class Solution {
    public int candy(int[] ratings) {
        int cnt=0;
        int n=ratings.length;
        int []a=new int[n];
        int []b=new int[n];
        Arrays.fill(a,1);
        Arrays.fill(b,1);
        for(int i=1;i<n;i++){
              if(ratings[i]>ratings[i-1]){
                   a[i]=a[i-1]+1;
              }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                 b[i]=b[i+1]+1;
            }

        }
        for(int k=0;k<n;k++){
            cnt+=Math.max(a[k],b[k]);
        }
        return cnt;
    }
}