class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
          int zerocnt=0;
          int onecnt=0;
          for(int e:students){
               if(e==0){
                  zerocnt++;
               }
               else{
                onecnt++;
               }
          }
          for(int e:sandwiches){
              if(e==0&&zerocnt>0){
                  zerocnt--;
              }
              else if(e==1&&onecnt>0){
                   onecnt--;
              }
              else{
                 return zerocnt+onecnt;
              }
          }
          return 0;
          

    }
}