class Solution {
    public int compareVersion(String version1, String version2) {
         String []v1=version1.split("\\.");
         String []v2=version2.split("\\.");
         int len=Math.max(v1.length,v2.length);
         for(int i=0;i<len;i++){
             int n1=(i<v1.length)?Integer.valueOf(v1[i]):0;
             int n2=(i<v2.length)?Integer.valueOf(v2[i]):0;
             if(n1>n2){
                 return 1;
             }
            else if(n1<n2){
                 return -1;
             }
         }
         return 0;
    }
}