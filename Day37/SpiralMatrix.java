class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        List<Integer>al=new ArrayList<>();
        int tr=0;
        int lc=0;
        int rc=c-1;
        int br=r-1;
        int total=0;
        while(total<r*c){
            for(int j=lc;j<=rc&&total<r*c;j++){
                al.add(matrix[tr][j]);
                 total++;
            }
            tr++;
           
            for(int i=tr;i<=br&&total<r*c;i++){
                al.add(matrix[i][rc]);
                 total++;
            }
            rc--;
            
            for(int j=rc;j>=lc&&total<r*c;j--){
                al.add(matrix[br][j]);
                 total++;
            }
            br--;
            
            for(int i=br;i>=tr&&total<r*c;i--){
                al.add(matrix[i][lc]);
                 total++;
            }
            lc++;
            
        }
        return al;

    }
}