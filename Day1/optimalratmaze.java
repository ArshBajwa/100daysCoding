package backtracking;

public class optimalratmaze {
    public static void maz(int sr,int sc,int er,int ec,int [][]maze,String s){
        if(sr<0||sc<0)return;
        if(sr>er||sc>ec)return;
        if(maze[sr][sc]==0)return;
        if(maze[sr][sc]==-1)return;
        if(sr==er&&sc==ec){
            System.out.println(s);
            return;
        }
        maze[sr][sc]=-1;
        maz(sr+1, sc, er, ec, maze, s+"D");
        maz(sr, sc+1, er, ec, maze, s+"R");
        maz(sr-1, sc, er, ec, maze, s+"U");
        maz(sr, sc-1, er, ec, maze, s+"L");
        maze[sr][sc]=1;

    }
    public static void main(String[] args) {
        int r=3;
        int c=4;
        int maze[][]={
            {1,0,1,1},
            {1,1,1,1},
            {1,1,0,1}
        };
        maz(0, 0, r-1, c-1, maze, "");
    }
}
