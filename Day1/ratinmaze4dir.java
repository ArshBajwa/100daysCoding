package backtracking;
import java.util.*;
public class ratinmaze4dir {
    public static void maze(int sr,int sc,int er,int ec,String s,boolean[][]visited){
        if(sr<0|sc<0)return;
        if(sr>er||sc>ec)return;
        if(visited[sr][sc])return;
        if(sr==er&&sc==ec){
            System.out.println(s);
            return;
        }
        visited[sr][sc]=true;
        maze(sr+1, sc, er, ec, s+"D",visited);
        maze(sr, sc+1, er, ec, s+"R",visited);
        maze(sr-1, sc, er, ec, s+"U",visited);
        maze(sr, sc-1, er, ec, s+"L",visited);
        visited[sr][sc]=false;
        //rat wapis loop mai fass jana recursion se toh ismai checkmark lgana padega
        
    }
      public static void main(String[] args) {
        int r=3;
        int c=3;
        boolean [][]visited=new boolean[r][c];
        maze(0, 0, r-1, c-1,"",visited);
        
      }
}
