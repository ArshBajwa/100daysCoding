class Solution {
    public int maxNumberOfBalloons(String text) {
        int cntb=0;
        int cnta=0;
        int cntl=0;
        int cnto=0;
        int cntn=0;
        for(int i=0;i<text.length();i++){
             if(text.charAt(i)=='b'){
                  cntb++;
             }
             if(text.charAt(i)=='a'){
                  cnta++;
             }
             if(text.charAt(i)=='l'){
                 cntl++;
             }
             if(text.charAt(i)=='o'){
                 cnto++;
             }
             if(text.charAt(i)=='n'){
                 cntn++;
             }

        }
        return Math.min(Math.min(cnto/2,cntl/2),Math.min(Math.min(cnta,cntb),cntn)); 
    }
}